/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addNode( long sumL3){
        ListNode l3=new ListNode(0);
        ListNode dumb=l3;
        while (sumL3!=0){
            int s=(int)(sumL3%10);
            ListNode newNode=new ListNode(s);
            l3.next=newNode;
            l3=l3.next;
            sumL3=sumL3/10;
        }
        return dumb.next;

    }

    public long returnSum(ListNode c1){
        long y=0;
        long p=1;
        while(c1!=null){
            y=p*c1.val+ y;
            p=p*10;
            c1=c1.next;
        }
        return y;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long sumL1=returnSum(l1);
        long sumL2=returnSum(l2);
        long sumL3= sumL1+sumL2;
        //ListNode l3=new ListNode(0);
        // l3= addNode(l3,(int)sumL3);
        return addNode((int)sumL3);
   /*
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (sumL3 != 0) {
            int s = (int) (sumL3 % 10);
            ListNode newNode = new ListNode(s);
            current.next = newNode;
            current = current.next;
            sumL3 = sumL3 / 10;
        }

        return dummyHead.next;*/
    }
}