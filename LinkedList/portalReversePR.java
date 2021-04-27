private void reversePRHelper(Node node){
      // write your code here
      if(node.next==null){
          Node temp = head;
          head = tail;
          tail = temp;
          return;
      }
      reversePRHelper(node.next);
      Node forw = node.next;
      forw.next = node;
    }

    public void reversePR(){
      // write your code here
      reversePRHelper(head);
      tail.next = null;
    }