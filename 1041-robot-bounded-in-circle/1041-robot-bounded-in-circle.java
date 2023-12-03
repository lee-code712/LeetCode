class Solution {
    public boolean isRobotBounded(String instructions) {
        if (instructions.length() == 0) {
            return false;
        }

        int x = 0;
        int y = 0;
        char direction = 'N';
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G') {
                if (direction == 'N') {
                    y++;
                }
                else if (direction == 'S') {
                    y--;
                }
                else if (direction == 'E') {
                    x++;
                }
                else if (direction == 'W') {
                    x--;
                }
            }
            else if (instruction == 'L') {
                if (direction == 'N') {
                    direction = 'E';
                }
                else if (direction == 'S') {
                    direction = 'W';
                }
                else if (direction == 'E') {
                    direction = 'S';
                }
                else if (direction == 'W') {
                    direction = 'N';
                }
            }
            else if (instruction == 'R') {
                if (direction == 'N') {
                    direction = 'W';
                }
                else if (direction == 'S') {
                    direction = 'E';
                }
                else if (direction == 'E') {
                    direction = 'N';
                }
                else if (direction == 'W') {
                    direction = 'S';
                }
            }
        }

        if (direction != 'N' || (x == 0 && y == 0)) {
            return true;
        }
        return false;
    }
}