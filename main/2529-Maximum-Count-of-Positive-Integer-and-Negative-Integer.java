class Solution {
    public int maximumCount(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int neg = negCount(nums);
        int pos = posCount(nums, neg);
        if (nums[0] > 0 || nums[nums.length - 1] < 0 ) return nums.length;
        System.out.print(pos);
        System.out.print(neg);
        return Math.max(nums.length - pos, neg);
    }

    public int posCount(int [] nums, int neg) {
        while(neg < nums.length && nums[neg] == 0) neg++;
        return neg;
    }

    public int negCount(int [] nums) {
        int low = 0;
        int high = nums.length - 1;
        int pos = 0;
        while(low < high) {
            int mid = low + (high - low)/2;
            if (nums[mid] < 0) {
               low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}