private Node getNodeAt(int idx) {
        Node curr = this.head;
        while (idx-- > 0) {
            curr = curr.next;
        }
        return curr;
    }

    

    public void removeAt(int idx) {
      // write your code here
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (size == 1) {
        this.head = this.tail = null;
        this.size = 0;
      } else if (size == 0) {
         System.out.println("List is empty");
       } else if (idx == 0)
             removeFirst();
        else if (idx == this.size - 1)
             removeLast();
        else {
            Node prev = getNodeAt(idx - 1);
            Node curr = prev.next;
            Node forw = curr.next;

            prev.next = forw;
            curr.next = null;

            this.size--;
        }
       
    }