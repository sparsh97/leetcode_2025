class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> check = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            int res = target - nums[i];
            if (check.containsKey(res)) {
                return new int[]{i, check.get(res)};
            }
                check.put(nums[i], i);
        }
        return ans;
    }
}