package Dsa_Questions;

public class swap2nodes extends LinkedList{


        public void swapPairs(ListNode head) {
            if(head==null||head.next==null){
                return ;
            }
            ListNode dummy=new ListNode(0);
            dummy.next=head;
            ListNode prev=dummy;

                while(prev.next!=null&& prev.next.next!=null){
                    ListNode first =prev.next;
                    ListNode second=first.next;
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                    prev=first;


            }
            display(dummy.next);

    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(9);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        l1.next.next.next.next.next=new ListNode(6);
        l1.next.next.next.next.next.next=new ListNode(7);
        swap2nodes obj=new swap2nodes();
        obj.swapPairs(l1);

    }
}
