 public int getFirst(){
      // write your code here
      if(this.size == 0)  {
          System.out.println("List is empty");
          return -1;
      }
      return this.head.data;
      
    }

    public int getLast(){
      // write your code here
      if(this.size == 0)  {
          System.out.println("List is empty");
          return -1;
      }
      return this.tail.data;
    }

    public int getAt(int idx){
      // write your code here
       if (this.size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx ; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }