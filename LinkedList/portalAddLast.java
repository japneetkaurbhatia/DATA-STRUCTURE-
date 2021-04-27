void addLastNode(Node node){
        if(this.head == null){
            this.tail = node;
            this.head = node;
        }
        else{
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    void addLast(int val) {
      // Write your code here
      Node node = new Node();
      node.data = val;
      addLastNode(node);
    }