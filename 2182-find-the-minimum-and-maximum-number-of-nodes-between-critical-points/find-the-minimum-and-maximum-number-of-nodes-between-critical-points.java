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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
        if(head == null || head.next==null || head.next.next==null) return ans;
        ListNode pre=head;
        ListNode curr=head.next;
        ListNode nex=curr.next;
        int l=0;
        while(pre != null){
            pre=pre.next;
            l++;
        }
        pre=head;
        int[] arr=new int[l];
        int i=1; int j=0;
        Arrays.fill(arr,100000);
        while(nex!=null){
            if((curr.val > pre.val && curr.val > nex.val) || (curr.val < pre.val && curr.val < nex.val)){ arr[j]=i;  j++;}
            i++;
            pre=curr;
            curr=nex;
            nex=nex.next;
        }
        Arrays.sort(arr);

        int k=0;
        while(arr[k] != 100000){
            k++;
        }
        if(k<2) return ans;
        int min=Integer.MAX_VALUE;
        for(int z=0;z<k-1;z++){
            min=Math.min(min,arr[z+1]-arr[z]);
        }
        ans[0]=min;
        ans[1]=arr[k-1]-arr[0];
        return ans;
    }
}