package Dsa_Questions;

public class RotateList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    static class Solution {
        public void rotateRight(ListNode head, int k) {
            ListNode dummy=new ListNode(0);
            ListNode temp=dummy;
            int len=len(head);
            k=k%len;
            for(int i=len-k;i<len;i++){
                int x=value(head,i);
                temp.next=new ListNode(x);
                temp=temp.next;
            }
            for(int i=0;i<len-k;i++){
                temp.next=new ListNode(value(head,i));
                temp=temp.next;
            }
            display(dummy.next);
        }
        public int value(ListNode head,int i){
            ListNode temp=head;
            while(i>0){
                temp=temp.next;
                i--;
            }
            return temp.val;
        }
        public void display(ListNode head){
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.print("END");
        }
        public int len(ListNode head){
            int len=0;
            ListNode temp=head;
            while(temp!=null){
                temp=temp.next;
                len++;
            }
            return len;
        }
    }


    public static void main(String[] args) {
        ListNode obj=new ListNode(0);
        obj.next=new ListNode(1);
        obj.next.next=new ListNode(2);
 //       obj.next.next.next=new ListNode(4);
 //       obj.next.next.next.next=new ListNode(5);
        Solution solution=new Solution();
        solution.display(obj);
        System.out.println();
        solution.rotateRight(obj,4);

    }
}
