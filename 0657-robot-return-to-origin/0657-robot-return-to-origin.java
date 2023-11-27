class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        // String을 charAt(i)에서 toCharArray()로 변경 후 2ms 단축
        for (char move : moves.toCharArray()) {
            if (move == 'R') {
                x++;
            }
            else if (move == 'L') {
                x--;
            }
            else if (move == 'U') {
                y--;
            }
            else if (move == 'D') {
                y++;
            }
        }
        
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }
}