class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                sum += symbols.get(s.charAt(i));
                break;
            }

            if (symbols.get(s.charAt(i)) < symbols.get(s.charAt(i + 1))) { // 작은 수가 먼저 오는 경우
                sum = sum + symbols.get(s.charAt(i + 1)) - symbols.get(s.charAt(i));
                i++;
            }
            else {
                sum += symbols.get(s.charAt(i));
            }
        }
        return sum;
    }
}