class Solution {
    public boolean canAliceWin(int n) {
        int remove=10;
        boolean alice=true;
        while(remove>0){
            if(n<remove) return (!alice);
            if(alice==true  ){
                n-=remove;
                alice=false;
                remove--;
            }
            else{
                n-=remove;
                alice=true;
                remove--;
            }
        }
        return !alice;
    }
}