/**
 * Reorder a singly linked list.
 * Example #1:
 *  Given 1->2->3->4, reorder it to 1->4->2->3.
 * Example #2:
 *  Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 *	
 * Solution using two runners / pointers technique (slow runner and fast runner).
 * 3 ms solution beat 98.6% for java solution on leetcode.com
 */
 public static void reorderList(ListNode head) {
    ListNode cur = head;
    ListNode p = head;
    while (cur != null && cur.next != null) {
    	p = p.next;
       	cur = cur.next.next;
    }
        
    ListNode n = null, t = null, tmp = null, current = head;
    while (current != null) {
        if (p != null) {
            t = n;
            n = p;
            p = p.next;
            n.next = t;
        } else {
            tmp = current.next;
            if (n.next != null) {
                current.next = n;
                n = n.next;
                current.next.next = tmp;
                current = current.next.next;
            } else {
                current = current.next;
            }
         }
      }
   }
