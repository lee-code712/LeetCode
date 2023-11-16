class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String sub = s + s;
        sub = sub.substring(1, sub.length() - 1);
        return sub.contains(s);
    }
}