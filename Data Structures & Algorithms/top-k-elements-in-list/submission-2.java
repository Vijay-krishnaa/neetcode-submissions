
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // List<Integer> list = new ArrayList<>();

        // for (int key : map.keySet()) {
        //     if (map.get(key) >= k) {
        //         list.add(key);
        //     }
        // }

        // int[] result = new int[list.size()];

        // for (int i = 0; i < list.size(); i++) {
        //     result[i] = list.get(i);
        // }

        // return result;
        

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert keys to list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort by frequency (descending)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Take first k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
