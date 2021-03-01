public int size(){
      // write code here
      return this.size;
    }

    public void display(){
      // write code here
      Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
