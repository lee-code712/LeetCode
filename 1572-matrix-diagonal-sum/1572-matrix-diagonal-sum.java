class Solution {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0];
        }

        int x = 0;
        int y = mat.length - 1;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][x++] + mat[i][y--];
        }
        if (mat.length % 2 != 0) {
            sum -= mat[x/2][x/2];
        }
        
        return sum;
    }
}