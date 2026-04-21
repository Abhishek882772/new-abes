class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0),curr=temp;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int s=c;
            if(l1!=null) { s+=l1.val; l1=l1.next;}
            if(l2!=null) {s+=l2.val; l2=l2.next;}
            c=s/10;
            curr.next=new ListNode(s%10);
            curr=curr.next;
        }
        return temp.next;
    }
}