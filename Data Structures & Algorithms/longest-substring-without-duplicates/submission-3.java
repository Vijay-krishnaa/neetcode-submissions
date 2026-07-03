// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int res = 0;
//         for (int i = 0; i < n; i++) {
//             HashSet<Character> set = new HashSet<>();
//             for (int j = i; j < n; j++) {
//                 if (set.contains(s.charAt(j))) break;
//                 set.add(s.charAt(j));
//             }
//             res = Math.max(res,set.size());
//         }
//         return res;
//     }

// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }

            map.put(s.charAt(right), right);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
} 
