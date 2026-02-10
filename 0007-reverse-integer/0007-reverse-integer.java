/*class Solution {
    public int reverse(int x) {
        int result = 0;
        int tmp = 0;

        while(x != 0) {
            tmp = result * 10 + (x % 10);
            // tmp를 구한 계산을 거꾸로 수행해 이전 값과 동일한지 확인
            if((tmp - x % 10) / 10 != result) {
                return 0;
            }
            result = tmp;
            x /= 10;
        }

        return result;
    }
}*/

class Solution {
    public int reverse(int x) {
        long result = 0;

        while(x != 0) {
            result = result * 10 + (x % 10);
            x /= 10;
        }

        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
}