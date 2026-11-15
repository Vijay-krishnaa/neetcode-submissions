// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         // int n = nums.length;
//         // int[] res = new int[n];
//         // for(int i = 0;i<n;i++){
//         //     int p = 1;
//         //     for(int j = 0;j<n;j++){
              
//         //       if( i != j) p *= nums[j];
//         //     }
//         //     res[i] = p;
//         // }
//         // return res;



//     }
// }  
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate prefix product (left side)
        int prefix = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefix;       // Store product of elements on the left
            prefix = prefix * nums[i]; // Update prefix for the next index
        }

        // Step 2: Calculate suffix product (right side)
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix; // Multiply left product by right product
            suffix = suffix * nums[i];      // Update suffix for the next index
        }

        return result;
    }
}
