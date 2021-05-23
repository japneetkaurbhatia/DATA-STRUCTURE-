import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        linkedlist ll = new linkedlist();
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            ll.addLast(scn.nextInt());
        }
        ll.removeDuplicates();
        ll.display();
    }
    
    private static class Node {
        int data = 0;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }
  public static class linkedlist {
    
     private Node head = null;
    private Node tail = null;
    private int size = 0;

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    public void addLastNode(Node node){
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;
    }
    public void addLast(int data){
        Node node = new Node(data);
        addLastNode(node);
    }
    
    public int getFirst(){
        return this.head.data;
    }
    
    private Node removeFirstNode() {
        Node removeNode = this.head;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node forw = this.head.next;
            removeNode.next = null;
            this.head = forw;
        }

        this.size--;
        return removeNode;
    }

    public void removeFirst(){
       Node node = removeFirstNode();
    }
    
    public void removeDuplicates(){
        linkedlist res = new linkedlist();
        while(this.size > 0){
            int val = this.getFirst();
            this.removeFirst();
        
        
        if (res.size() == 0 || val != res.tail.data)
            res.addLast(val);
        }
        
      this.head = res.head;
      this.tail = res.tail;
      this.size = res.size;
    }
}
}
