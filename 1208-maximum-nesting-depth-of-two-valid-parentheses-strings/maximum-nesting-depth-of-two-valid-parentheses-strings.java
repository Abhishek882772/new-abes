class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        if(seq.length()==1) return new int[]{0};
        int[] arr=new int[seq.length()];
        int sum=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='(') sum+=1;
            if(seq.charAt(i)==')') sum-=1;
            if(sum%2==0 && seq.charAt(i)=='(') arr[i]=1;
            else if(sum%2!=0 && seq.charAt(i)==')') arr[i]=1;
            else arr[i]=0;
        } 
        return arr;
    }
}