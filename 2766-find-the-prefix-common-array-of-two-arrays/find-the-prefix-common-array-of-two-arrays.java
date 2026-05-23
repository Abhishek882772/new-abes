class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> map=new HashSet<>();
        HashSet<Integer> map1=new HashSet<>();
        int count=0;
        int arr[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(map1.contains(A[i])) count++;
            map.add(A[i]);
            if(map.contains(B[i])) count++;
            map1.add(B[i]);
            arr[i]=count;
        }
        return arr;
    }
}