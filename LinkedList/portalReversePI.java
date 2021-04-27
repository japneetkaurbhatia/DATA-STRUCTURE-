 public void reversePI(){
      // write your code here
      Node curr = head;
      Node prev = null;
      while(curr != null){
          Node forw = curr.next;
          curr.next = prev;
          prev = curr;
          curr = forw;
      }
      tail = head;
      head = prev;
    }