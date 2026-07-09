class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
           int no=i;
           int co=0;
           if(no==1 || no==0){
                if(map.get(no)%2 != 0)
                co=map.get(no);
                else co=map.get(no) -1;
                
            }
            else{while(map.containsKey(no) && map.get(no)>1){
                no*=no;
                co=co+2;
            }
            if(map.containsKey(no)){
                co++;
            }else co--;
            }
           count=Math.max(count,co);
    }
    return count;
    }
}