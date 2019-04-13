   /**
    * Reverse a singly linked list.
    * Example #1:
    *    Input:   1->2->3->4->5->NULL
    *    Output: 5->4->3->2->1->NULL
    * Note: A linked list can be reversed either iteratively or recursively.
    */

   /** 
    * Solution #1 - Creating a new linked list and coping the elements in reverse order. This is a slower solution because
    * we have to copy nodes to new list while traversing down the original linked list.
    */
   public static ListNode reverseList(ListNode head) {
      ListNode h = head;
      ListNode n = h;
      ListNode p = null;
      ListNode rev = new ListNode(0);
      ListNode cur = rev;
      
      while (n != null) {
         p = n;
         n = n.next;
         if (n == null) {
            cur.next = new ListNode(p.val);
            head = rev.next;
         } else if (n.next == null) {
            cur.next = new ListNode(n.val);
            cur = cur.next;
            p.next = null;
            n = h;
         }
      }
      return head;   
   }


   /**
    * Solution #2: - Traversing down the linked list and change the pointers in the current node to the previous node.
    * Time complexity is O(n) - n is the size of the list's length. Space complexity is O(1) constant space.
    */
   public static ListNode reverseList2(ListNode head) {
      ListNode n = head;
      ListNode p = null;
      ListNode q = null;
      while (n != null) {
         p = q;
         q = n;
         n = n.next;
         q.next = p;
      }
      return q;
   }
