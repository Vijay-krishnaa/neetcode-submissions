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

            char c = s.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
} 
