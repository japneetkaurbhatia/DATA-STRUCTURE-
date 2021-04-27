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