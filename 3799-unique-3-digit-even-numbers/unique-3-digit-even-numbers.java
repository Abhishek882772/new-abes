class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashSet <Integer> set=new HashSet<>();
            int m=0;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            m+=digits[i];
            for(int j=0;j<n;j++){
                if(j==i) continue;
                m*=10;
                m+=digits[j];
                for(int k=0;k<n;k++){
                    if(k==j || k==i) continue;
                m*=10;
                m+=digits[k];
                if(m%2==0) set.add(m);
                m/=10;
        }
         m/=10;
        }
         m/=10;
        }
        return set.size();
    }
}