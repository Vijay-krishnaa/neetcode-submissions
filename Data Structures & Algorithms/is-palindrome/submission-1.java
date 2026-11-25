class Solution {
    public boolean isPalindrome(String str) {
        int n = str.length();
        int s = 0;
        int e = n - 1;
        while (s < e) {
            while (s < e && !Character.isLetterOrDigit(str.charAt(s))) s++;
            while (s < e && !Character.isLetterOrDigit(str.charAt(e))) e--;
            if(Character.toLowerCase(str.charAt(s)) != Character.toLowerCase(str.charAt(e))) return false;
            s++;
            e--;
        }
        return true;
        }
    }