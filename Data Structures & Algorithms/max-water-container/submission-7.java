class Solution {
    public int maxArea(int[] h) {
        int a = 0;
        int n = h.length;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
                for(int j = i + 1;j < n;j++){
               // int wid = j-i;    
               count++;
                int min = Math.min(h[i], h[j]);
                a = Math.max(a, min * count);
            }
        }
        return a;
    }
}
