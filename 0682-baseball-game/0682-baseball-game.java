class Solution {
    public int calPoints(String[] operations) {
        List<Integer> nums = new ArrayList<>();
        for (String op : operations) {
            if (op.equals("C")) {
                nums.remove(nums.size() - 1);
            }
            else if (op.equals("D")) {
                nums.add(nums.get(nums.size() - 1) * 2);
            }
            else if (op.equals("+")) {
                nums.add(nums.get(nums.size() - 2) + nums.get(nums.size() - 1));
            }
            else {
                nums.add(Integer.valueOf(op));
            }
         }

         int sum = 0;
         for (int num : nums) {
             sum += num;
         }
        return sum;
    }
}