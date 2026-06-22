class Solution {
    public boolean isAnagram(String s, String t) {
        int m = t.length();
char[] a = s.toCharArray();
char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
     int i = 0;
     int e = m-1;
     if (s.length() != t.length()) {
    return false;
}
     while(i<=e){
        if(a[i] != b[i]) return false;
             i++;
           
    
     }
     
return true;
    }
}
