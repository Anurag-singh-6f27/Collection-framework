package Dsa_Questions;

public class partition_List extends LinkedList {
    static class Solution extends LinkedList {
        public void partition(ListNode head, int x) {
            ListNode less=new ListNode(0);
            ListNode lessp=less;
            ListNode great=new ListNode(0);
            ListNode greatp=great;
            while(head!=null){
                if(head.val<x){
                    lessp.next=head;
                    lessp=lessp.next;
                }
                else{
                    greatp.next=head;
                    greatp=greatp.next;
                }
                head=head.next;
            }
            greatp.next=null;
            lessp.next=great.next;
            display(less.next);

        }
        }
        public static void main(String[] args) {
            ListNode l1=new ListNode(1);
            l1.next=new ListNode(4);
            l1.next.next=new ListNode(3);
            l1.next.next.next=new ListNode(2);
            l1.next.next.next.next=new ListNode(5);
            l1.next.next.next.next.next=new ListNode(2);
            l1.next.next.next.next.next.next=new ListNode(9);
            Solution obj =new Solution();
            obj.partition(l1,3);

        }

}
