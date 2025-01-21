class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seenEarlier = new HashSet<>();
        for (int num : nums) {
            if (seenEarlier.contains(num)) {
                return true;
            } else {
                seenEarlier.add(num);
            }
        }
        return false;
    }
}