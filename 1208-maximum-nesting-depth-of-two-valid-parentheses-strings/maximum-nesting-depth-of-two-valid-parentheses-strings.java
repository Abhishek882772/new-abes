class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] arr=new int[seq.length()];
        int sum=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='(') {sum+=1; if(sum%2==0)arr[i]=1; }
            else {sum-=1; if(sum%2!=0) arr[i]=1; }
        } 
        return arr;
    }
}