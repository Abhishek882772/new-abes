class Solution {
    public boolean canCross(int[] stones) {
       HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int stone:stones){
            map.put(stone,new HashSet<>());
        }
        map.get(0).add(0);
        for(int stone:stones){
            for(int k:map.get(stone)){
            for(int i=k-1;i<=k+1;i++){
                if(i<=0) continue;
                int step=stone+i;
                if(map.containsKey(step)){ map.get(step).add(i);
                if(step==stones[stones.length-1]) return true;}
            }
            }
        }
        return false;
    }
}