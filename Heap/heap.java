import java.util.ArrayList;

public class heap{
    private ArrayList<Integer> arr;
    private int size = 0;

    private void initialize(){
        this.arr = new ArrayList<>();
        this.size = 0;
    }

    public heap(){  
        initialize();
    }

    public heap(int[] arr){
        initialize();
        for(int ele : arr){
            this.add(ele);
        }
        for(int i = this.arr.size()-1; i >= 0; i--){
            downHeapify(i);
        }
        this.size = arr.length;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void add(int data){
        this.arr.add(data);
        this.size++;
        upheapify(this.size()-1);
    }

    public int remove(){
        int n = this.arr.size();
        int rv = this.arr.get(0);
        swap(0,n-1);
        this.arr.remove(n-1);
        this.size--;
        downHeapify(0);
        return rv;
    }

    public int peek(){
        return this.arr.get(0);
    }

    private void swap(int i, int j){
        int ei = arr.get(i);
        int ej = arr.get(j);
        arr.set(i,ej);
        arr.set(j,ei);
    }

    private void downHeapify(int pi){
        int maxIdx = pi;
        int lci = 2*pi+1;
        int rci = 2*pi+2;
        if(lci < arr.size() && arr.get(maxIdx) < arr.get(lci))
            maxIdx = lci;
        if(rci < arr.size() && arr.get(maxIdx) < arr.get(rci))
            maxIdx = rci;
        if(maxIdx != pi){
            swap(maxIdx,pi);
            downHeapify(maxIdx);
        }
    }

    private void upheapify(int ci){
        int pi = (ci - 1)/2;
    }

    public static void main(String[] args){
        
    }
}