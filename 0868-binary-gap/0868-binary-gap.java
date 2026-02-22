class Solution {
    public int binaryGap(int n) {
        int maxLen = 0;

        StringBuilder sb = new StringBuilder();
        while(n != 0 && n != 1) {
            sb.append(n%2);
            n /= 2;
        }
        sb.append(n);
        sb.reverse();

        int tmp = 0;
        for(char c : sb.toString().toCharArray()) {
            if(tmp == 0 && c == '1')  {// 시작
                tmp += 1;
                continue;
            }
            if(tmp > 0 && c == '1') {// 종료
                maxLen = Math.max(maxLen, tmp);
                tmp = 1;
                continue;
            }
            if(c == '0') {
                tmp += 1;
            }
        }

        return maxLen;
    }
}