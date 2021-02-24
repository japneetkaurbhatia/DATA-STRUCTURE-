public class linkedlist {

    private class Node {
        int data = 0;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int sizeOfLL = 0;

    public boolean isEmpty() {
        return this.sizeOfLL == 0;
    }

    public int size() {
        return this.sizeOfLL;
    }

    public void EmptyException() throws Exception {
        if (this.sizeOfLL == 0) {
            throw new Exception("LinkedList is Empty");
        }
    }

    public void IndexOutOfBoundSizeExclusiveException(int idx) throws Exception {
        if (idx < 0 || idx >= this.sizeOfLL)
            throw new Exception("Index Out Of Bound");
    }

    public void IndexOutOfBoundSizeInclusiveException(int idx) throws Exception {
        if (idx < 0 || idx > this.sizeOfLL)
            throw new Exception("Index Out Of Bound");
    }

    public int getFirst() throws Exception {
        EmptyException();
        return this.head.data;
    }

    public int getLast() throws Exception {
        EmptyException();
        return this.tail.data;
    }
////////////////////////////////////////
    private Node getNodeAt(int idx) {
        if (idx == 0)
            getFirst();
        else if (idx == this.sizeOfLL)
            getLast();
        else {
            Node curr = this.head;
            Node forw = prev.next;

            prev.next = node;
            node.next = forw;

            return 

        }
    }

    public int getAt(int idx) {
        IndexOutOfBoundSizeExclusiveException(idx);
        Node node = getNodeAt(idx);
        return node.data;
    }

    private void addFirstNode(Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.sizeOfLL++;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        addFirstNode(node);
    }

    private void addLastNode(Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.sizeOfLL++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        addLastNode(node);
    }

    private void addAtNode(int idx, Node node) {
        if (idx == 0)
            addFirstNode(node);
        else if (idx == this.sizeOfLL)
            addLastNode(node);
        else {
            Node prev = getNodeAt(idx - 1);
            Node forw = prev.next;

            prev.next = node;
            node.next = forw;

            this.sizeOfLL++;
        }
    }

    public void addAt(int idx, int data) {
        IndexOutOfBoundSizeInclusiveException(idx);
        Node node = new Node(data);
        addAtNode(idx, node);
    }

    private Node removeFirstNode() {
        Node removeNode = this.head;
        if (this.sizeOfLL == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node forw = this.head.next;
            removeNode.next = null;
            this.head = forw;
        }

        this.sizeOfLL--;
        return removeNode;
    }

    public int removeFirst() throws Exception {
        EmptyException();
        Node node = removeFirstNode();
        return node.data;
    }

    private Node removeLastNode() {
        Node removeNode = this.tail;
        if (this.sizeOfLL == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node secondLastNode = getNodeAt(this.sizeOfLL - 2);
            this.tail = secondLastNode;
            this.tail.next = null;
        }

        this.sizeOfLL--;
        return removeNode;

    }

    public int removeLast() {
        EmptyException();
        Node node = removeLastNode();
        return node.data;
    }
//////////////////////////////////
    private Node removeAtNode(int idx) {
        Node removeNode = this.head;
        if (this.sizeOfLL == 1) {
            removeFirst();
        } else {
            Node prev = getNodeAt(idx - 1);
            Node removeNode = getNodeAt(idx);
            Node forw = getNodeAt(idx + 1);

            prev.next = forw;
        }

        this.sizeOfLL--;
        return removeNode;

    }

    public int removeAt(int idx) {
        ..EmptyException();
        Node node = removeAtNode(idx);
        return node.data;
    }

}

// public class linkedList{
//     private class Node{
//         int data = 0;
//         Node next = null;
//         Node(int data){
//             this.data = data;
//         }
//     }

//     private Node head = null;
//     private Node tail = null;

//     private int sizeOfLL = 0;

//     public boolean isEmpty(){
//         if(sizeOfLL == 0)  return true;
//         return false;
//     }

//     public int size(){
//         return sizeOfLL;
//     }

//     public void emptyException() throws Exception{
//         if(sizeOfLL == 0)
//            throw Exception("Empty Linked List");
//     }

//     private void addFirstNode(Node node){
//         if(this.head == null){
//             this.head = node;
//             this.tail = node;
//         }
//         else{
//             node.next = this.head;
//             this.head = node;
//         }
//     }

//     private void addFirst(int data){
//         Node node = new Node(data);
//         addFirstNode(node);
//     }

//     private void addLastNode(Node node){
//         if(this.head == null){
//             this.head = node;
//             this.tail = node;
//         }
//         else{
//             this.tail.next = node;
//             this.tail = node;
//         }
//         this.sizeofLL++;
//     }

//     private void addLast(int data){
//         Node node = new Node(data);
//         addLastNode(node);
//     }

//     private removeFirst(){
//         emptyException();
//         node.next = this.head;
//         this.head = this.head.next;  
//         sizeOfLL--; 
//         return this.head;    
//     }
    
//     private removeLast(){
//         emptyException();
//         this.tail.next = node;
//         this.tail = node;
//         sizeOfLL--; 
//         return this.tail;
//     }

//     private removeAt(){

//     }
// }
