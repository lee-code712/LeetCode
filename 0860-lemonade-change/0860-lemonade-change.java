class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] changes = new int[2];
        for (int bill : bills) {
            if (bill == 5) {
                changes[0]++;
                continue;
            }
            if (bill == 10) {
                if (changes[0] < 1) return false;
                changes[1]++;
                changes[0]--;
                continue;
            }
            if (bill == 20) {
                if (changes[0] < 1 || changes[1] < 1) { 
                    if (changes[0] < 3) return false;
                }
                if (changes[0] >= 1 && changes[1] >= 1) {
                    changes[0]--;
                    changes[1]--;
                }
                else if (changes[0] >= 3) {
                    changes[0] -= 3;
                }
            }
        }
        return true;
    }
}