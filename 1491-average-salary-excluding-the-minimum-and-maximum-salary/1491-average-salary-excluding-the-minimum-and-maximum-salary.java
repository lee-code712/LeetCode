class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}