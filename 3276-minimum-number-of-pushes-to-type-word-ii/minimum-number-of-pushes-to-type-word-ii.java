class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(char c:word.toCharArray()){
              arr[c-'a']++;
        }
        Arrays.sort(arr);
        int p=0; int count=0;
        while(p<arr.length && arr[25-p]>0){ count++;
        p++;
        }
        int ans=0;
        if(count<=8){ 
            for(int i=0;i<count;i++){
            ans+=arr[25-i];
        }}
        else if(count<=16){
            for(int i=0;i<8;i++){
            ans+=arr[25-i];
        }
        for(int i=8;i<count;i++){
            ans+=(arr[25-i]*2);
        }
        }
        else if(word.length()<=24){
            for(int i=0;i<8;i++){
            ans+=arr[25-i];
        }
        for(int i=8;i<16;i++){
            ans+=(arr[25-i]*2);
        }
        for(int i=16;i<count;i++){
            ans+=(arr[25-i]*3);
        }
        }
        else{
            for(int i=0;i<8;i++){
            ans+=arr[25-i];
        }
        for(int i=8;i<16;i++){
            ans+=(arr[25-i]*2);
        }
        for(int i=16;i<24;i++){
            ans+=(arr[25-i]*3);
        }
        for(int i=24;i<count;i++){
            ans+=(arr[25-i]*4);
        }
        }
        return ans;
    }
}