class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String sub = s + s;
        sub = sub.substring(1, sub.length() - 1); // 반복을 확인하기 위해 앞, 뒤 한문자 제외
        return sub.contains(s);
    }
}