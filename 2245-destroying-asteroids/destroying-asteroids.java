class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long ans=mass;
        Arrays.sort(asteroids);
        for(int i:asteroids){
            if(i>ans) return false;
            ans+=i;
        }
        return true;
    }
}