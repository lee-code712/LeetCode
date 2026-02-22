/*class Solution {
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
}*/

class Solution {
    public int binaryGap(int n) {
        int maxLen = 0;
        int lastPos = -1; // 마지막으로 '1'을 발견한 위치
        int currentPos = 0; // 현재 비트 위치

        while (n > 0) {
            // 가장 오른쪽 비트가 1인지 확인
            if ((n & 1) == 1) {
                if (lastPos != -1) {
                    // 현재 위치와 이전 '1'의 위치 차이 계산
                    maxLen = Math.max(maxLen, currentPos - lastPos);
                }
                lastPos = currentPos;
            }
            // 숫자를 오른쪽으로 한 비트 이동 (n /= 2와 동일)
            n >>= 1;
            currentPos++;
        }

        return maxLen;
    }
}