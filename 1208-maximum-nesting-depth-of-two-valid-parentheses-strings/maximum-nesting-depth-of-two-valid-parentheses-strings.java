class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        if(seq.length()==1) return new int[]{0};
        int[] arr=new int[seq.length()];
        arr[0]=1;
        for(int i=1;i<seq.length();i++){
            if(seq.charAt(i)=='(') arr[i]=arr[i-1]+1;
            if(seq.charAt(i)==')') arr[i]=arr[i-1]-1;
        }
        for(int j=0;j<seq.length();j++){
            if(arr[j]%2==0 && seq.charAt(j)=='(') arr[j]=1;
            else if(arr[j]%2!=0 && seq.charAt(j)==')') arr[j]=1;
            else arr[j]=0;
        }
        return arr;
    }
}