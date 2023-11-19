class Solution {
    public int arraySign(int[] nums) {
        int signNum = 1;
        for (int num : nums) {
            if (num == 0) {
                signNum = 0;
                break;
            }
            if (num < 0) {
                signNum *= -1;
            }
        }
        return signNum;
    }
}