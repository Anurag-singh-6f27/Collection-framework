package Dsa_Questions;

public class LLaddTwoNumbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
   static class Solution {
        public void addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy=new ListNode(0);
            ListNode current=dummy;
            int carry=0,sum=0;
            while(l1!=null||l2!=null||carry>0){
                int first=l1!=null? l1.val : 0;
                int second=l2!=null? l2.val : 0;
                sum=first+second+carry;

                carry=sum/10;
                int digit=sum%10;
                current.next=new ListNode(digit);
                current=current.next;
                if(l1!=null)l1=l1.next;
                if(l2!=null)l2=l2.next;
            }
            dummy=dummy.next;
            while (dummy!=null){
                System.out.print(dummy.val);
                dummy=dummy.next;
            }
        }
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(9);
        l1.next=new ListNode(9);
        l1.next.next=new ListNode(9);
        l1.next.next.next=new ListNode(9);
        l1.next.next.next.next=new ListNode(9);
        l1.next.next.next.next.next=new ListNode(9);
        l1.next.next.next.next.next.next=new ListNode(9);
        ListNode l2=new ListNode(9);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(9);
        Solution obj=new Solution();
        obj.addTwoNumbers(l1,l2);

    }
}
