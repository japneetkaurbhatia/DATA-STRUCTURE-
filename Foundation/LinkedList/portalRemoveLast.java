private Node getNodeAt(int idx) {
        Node curr = this.head;
        while (idx-- > 0) {
            curr = curr.next;
        }
        return curr;
    }

    public void removeLast(){
      // write your code here
       if (size == 0) {
         System.out.println("List is empty");
       } 
    else if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node secondLastNode = getNodeAt(this.size - 2);
            this.tail = secondLastNode;
            this.tail.next = null;
        }

        this.size--;
    }
