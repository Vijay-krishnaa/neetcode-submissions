
// class Solution {
//     public int longestConsecutive(int[] nums) {

//         int longest = 0;

//         for (int i = 0; i < nums.length; i++) {

//             int current = nums[i];
//             int count = 1;

//             while (contains(nums, current + 1)) {
//                 current++;
//                 count++;
//             }

//             longest = Math.max(longest, count);
//         }

//         return longest;
//     }

//     // Check whether an element exists in the array
//     public boolean contains(int[] nums, int target) {

//         for (int num : nums) {
//             if (num == target) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }


class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Traverse the HashSet
        for (int num : set) {

            // Step 3: Find the starting point
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Step 4: Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Step 5: Update maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

