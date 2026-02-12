/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == j) continue; // 같은 숫자를 두번 사용하지 않음
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;
            if(map.containsKey(num2)) {
                return new int[] {map.get(num2), i};
            }
            map.put(num1, i);
        }
        return new int[0];
    }
}