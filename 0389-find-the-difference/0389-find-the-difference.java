class Solution {
    public char findTheDifference(String s, String t) {
        int tNum = 0;
        for (int i = 0; i < s.length(); i++) {
            tNum += (int) t.charAt(i);
            tNum -= (int) s.charAt(i);
        }
        tNum += (int) t.charAt(t.length() - 1);
        return (char) tNum;
    }
}