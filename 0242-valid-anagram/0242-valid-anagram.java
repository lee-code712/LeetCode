class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);

        chars = t.toCharArray();
        Arrays.sort(chars);
        t = new String(chars);

        return s.equals(t);
    }
}