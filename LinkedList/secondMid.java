
    public int mid(){
      // write your code here
      Node slow = head;
      Node fast = head;
      while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
      }
      return slow.data;
    }

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

    
    
    public Node getNodeAt(int idx){
        Node curr = head;
        while(idx-- > 0){
            curr = curr.next;
        }
        return curr;
    }

    public void reverseDI() {
      // write your code here
     int li = 0;
     int ri = size - 1;
      while(li < ri){
        Node lin = getNodeAt(li);
        Node rin = getNodeAt(ri);

        int temp = lin.data;
        lin.data = rin.data;
        rin.data = temp;

        li++;
        ri--;
      }
    }


    
    private void displayReverseHelper(Node node){
      // write your code here
      if(node == null) return;
      displayReverseHelper(node.next);
      System.out.print(node.data + " ");
      
    }


  