class Solution {
    public String mergeAlternately(String word1, String word2) {
        String answer = "";
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                answer += word1.charAt(i);
                if (i < word2.length()) {
                    answer += word2.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < word2.length(); i++) {
                if (i < word1.length()) {
                    answer += word1.charAt(i);
                }
                answer += word2.charAt(i);
            }
        }
        return answer;
    }
}