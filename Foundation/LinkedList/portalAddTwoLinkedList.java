public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
      // write your code here
      LinkedList ans = new LinkedList();
      one.reversePI();
      two.reversePI();
      
      Node c1 = one.head;
      Node c2 = two.head;
      int carry = 0;
      while(c1 != null || c2 != null || carry != 0){
          int sum = (c1 != null ? c1.data : 0) + (c2 != null ? c2.data : 0) + carry;
          carry = sum/10;
          sum = sum%10;
          
          ans.addFirst(sum);
          
          if(c1 != null)  c1=c1.next;
          if(c2 != null)  c2=c2.next;
      }
      one.reversePI();
      two.reversePI();
      
      return ans;
    }
