package Dsa_Questions;

public class LinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void display(ListNode head){
        ListNode dummy =head;
        while(dummy !=null){
            System.out.print(dummy.val);
            dummy=dummy.next;
        }
    }
}
