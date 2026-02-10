/*class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
}*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[len * 2];
        for(int i = 0; i < len; i++) {
            result[i] = nums[i];
            result[i + len] = nums[i];
        }
        return result;
    }
}