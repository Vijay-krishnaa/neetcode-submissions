class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //         List<List<String>> res = new ArrayList<>();
        //         boolean[] vis = new boolean[strs.length];

        //         for(int i = 0;i<strs.length;i++){
        //             if(vis[i]) continue;
        //             List <String> grp = new ArrayList<>();
        //             grp.add(strs[i]);
        //             vis[i] = true;
        //             for(int j = i+1 ; j<strs.length;j++){
        //                 if(!vis[j] && isAnagram(strs[i],strs[j])){
        //                     grp.add(strs[j]);
        //                     vis[j] = true;
        //                 }
        //             }
        //             res.add(grp);
        //         }
        //         return res;

        //     }
        //     private boolean isAnagram(String a , String b){
        //         if(a.length() != b.length()) return false;
        //         int[] count = new int[26];
        //         for(int i = 0; i< a.length();i++){
        //             count[a.charAt(i) - 'a']++;
        //             count[b.charAt(i) - 'a']--;
        //         }
        //    for(int c : count){
        //     if(c !=  0) return false;
        //    }
        // return true;

        if (strs.length == 0)
            return new ArrayList<>();
        Map <String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String freqStr = getFreq(str);
            if (map.containsKey(freqStr)) {
                map.get(freqStr).add(str);
            } else {
                List<String> grp = new ArrayList<>();
                grp.add(str);
                map.put(freqStr, grp);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String getFreq(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder frqString = new StringBuilder("");
        char c = 'a';
        for (int i : count) {
            frqString.append(c);
            frqString.append(i);
            c++;
        }
        return frqString.toString();
    }
}