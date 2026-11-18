
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
        for (int num : nums) set.add(num);
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
