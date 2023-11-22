class Solution {
    public String mergeAlternately(String word1, String word2) {
        // String에서 StringBuilder로 변경하고 실행시간 6ms 감소
        StringBuilder answer = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                answer.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                answer.append(word2.charAt(j++));
            }
        }
        return answer.toString();
    }
}