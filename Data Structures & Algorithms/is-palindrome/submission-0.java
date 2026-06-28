class Solution {
    public boolean isPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();
        int i = 0;
        int e=  n-1;
        while(i<e){
            if(s.charAt(i) != s.charAt(e)){
            return false;
        }
         i++;
        e--;
        }
       return true;
    }
}
