class Solution {
    public int[] twoSum(int[] num, int tar) {
        int s = 0;
        int e = num.length-1;
        while(s<e){
            int currSum = num[s] + num[e];
            if(tar < currSum ) e--;
            else if (tar > currSum ) s++;
            else return new int[]{s+1,e+1};
        }
        return new int[]{};
    }
}
