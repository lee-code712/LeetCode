/* class Solution {
    public int minimumCost(int[] nums) {
       int minSum = nums[0] + nums[1] + nums[2];

        for(int i = 1; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                minSum = Math.min(minSum, nums[0] + nums[i] + nums[j]);
            }
        }

        return minSum;
    }
}*/

class Solution {
    public int minimumCost(int[] nums) {
       Arrays.sort(nums, 1, nums.length);

        return nums[0] + nums[1] + nums[2];
    }
}