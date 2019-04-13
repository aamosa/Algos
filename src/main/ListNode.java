/**
 * Basic implementation of a singly linked list.
 */
 public class ListNode {
    int val;
    ListNode next;
    
    // default constructor -------------------------------------------------
    public ListNode() {}

    public ListNode(int d) {
        val = d;
        next = null;
    }
    
    // private constructor ---------------------------------------------------
    private ListNode(ListNode node) {
        ListNode t = this;
        while (t.next != null) {
            t = t.next;
        }
        t.next = node;
    }

    public void add(int val) {
        if (this.val == 0 && this.next == null) {
            this.val = val;
        } else {
            ListNode tmp = new ListNode(this);
            this.val = val;
            this.next = tmp;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (ListNode p = this; p != null; p = p.next) {
            s += String.valueOf(p.val);
            if (p.next != null)
                s += "->";
        }
        return s;
    }
  
    // static helper methods ----------------------------------------------------------
    
    // This helper method takes a given array and returns a singly linked list.
    public static ListNode ArrayToLinkedList(int[] nums) {
        ListNode node = new ListNode();
        ListNode t = node;
        for (int i = 0; i < nums.length; i++) {
            t.next = new ListNode(nums[i]);
            t = t.next;
        }
        return node.next;
    }
    
    // This helper method prints the nodes of a linked list each per separate line.
    public static void printLinkedList(ListNode head) {
        if (head == null) return;
        ListNode cur = head.next;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

}
