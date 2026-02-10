class Solution {
    public String longestPalindrome(String s) {
        String result = "";

        if(s.length() < 2) {
            return s;
        }

        String p1 = ""; // 홀수
        String p2 = ""; // 짝수
        String tmp = "";
        for(int i = 0; i < s.length(); i++) {
            p1 = getPalindrome(i, i, s);
            p2 = getPalindrome(i, i + 1, s);
            tmp = (p1.length() > p2.length()) ? p1 : p2;
            result = (tmp.length() > result.length()) ? tmp : result;
        }

        return result;
    }

    private String getPalindrome(int left, int right, String s) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}