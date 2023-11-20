class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreased = nums[0] < nums[nums.length - 1];
        if (isIncreased) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        }
        else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}