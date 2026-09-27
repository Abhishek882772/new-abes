class Solution {
    public boolean isPalidrome(String str) {
        int n = str.length();
        if (n <= 1) return true;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    } 


    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (isPalidrome(str)) {
                return str;
            }
        }
        return "";
    }
}