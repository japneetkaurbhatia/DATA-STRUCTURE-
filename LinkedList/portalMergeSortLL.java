
     public static Node midNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static LinkedList mergeSort(Node head, Node tail){
        if (head == tail) {
            LinkedList base = new LinkedList();
            base.addLast(head.data);
            return base;
        }
      // write your code here
      Node mid = midNode(head);
      
      Node head1 = head;
      Node tail1 = mid;
      Node head2 = mid.next;
      Node tail2 = tail;
      
      mid.next = null;
      LinkedList firstHalf = mergeSort(head1,tail1);
      LinkedList secondHalf = mergeSort(head2,tail2);
      mid.next = head2;
      return mergeTwoSortedLists(firstHalf,secondHalf);
    }