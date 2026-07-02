// class Solution {
//     public int trap(int[] h) {
//         int n = h.length;
//         int water = 0;

//         for (int i = 0; i < n - 1; i++) {
//             int rmax = h[i];
//             int lmax = h[i];

//             for (int j = i; j >= 0; j--) {
//                 lmax = Math.max(lmax, h[j]);
//             }
//             for (int k = i; k < n; k++) {
//                 rmax = Math.max(rmax, h[k]);
//             }

//             water += Math.min(rmax, lmax) - h[i];
//         }
//         return water;
//     }
// }
class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int s = 0;
        int e = n - 1;
        int lmax = 0;
        int rmax = 0;
        int total = 0;
        while (s < e) {
            if (h[s] < h[e]) {
                if (h[s] >= lmax) {
                    lmax = h[s];
                } else
                    total += lmax - h[s];
                s++;
            }

            else {
                if (h[e] >= rmax) {
                    rmax = h[e];
                } else
                    total += rmax - h[e];
                e--;
            }
        }

        return total;
    }
}
