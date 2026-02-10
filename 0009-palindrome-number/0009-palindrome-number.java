/*class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;   
    }
}*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int org = x;
        int reverse = 0;
        while(org > 0) {
            reverse = reverse * 10 + (org % 10); // 10 단위씩 계산
            org /= 10;
        }

        if(x == reverse) return true;
        return false;   
    }
}