public void removeFirst(){
      // write your code here
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        this.head = this.tail = null;
        this.size = 0;
      } else {
        this.head = this.head.next;
        this.size--;
      }
    }
