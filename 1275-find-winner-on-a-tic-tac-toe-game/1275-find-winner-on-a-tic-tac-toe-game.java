class Solution {
    public String tictactoe(int[][] moves) {
        int len = 3;
        int[][] grid = new int[len][len];
        
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
                grid[moves[i][0]][moves[i][1]] = 'X';
                if (isGameWinner(grid, 'X')) {
                    return "A";
                }
            }
            else {
                grid[moves[i][0]][moves[i][1]] = 'O';
                if (isGameWinner(grid, 'O')) {
                    return "B";
                }
            }

            if (i == 8) {
                return "Draw";
            }
        }
        return "Pending";
    }

    // 다른 방법 생각해보기
    public boolean isGameWinner(int[][] grid, char c) {
        if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2] && grid[0][2] == c ||
            grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2] && grid[1][2] == c ||
            grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2] && grid[2][2] == c ||
            grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[2][0] == c ||
            grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && grid[2][1] == c ||
            grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[2][2] == c ||
            grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[2][2] == c ||
            grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[2][0] == c) {
            return true;
        }
        return false;
    }
}