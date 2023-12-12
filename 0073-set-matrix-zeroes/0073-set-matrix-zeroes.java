class Solution {
    public void setZeroes(int[][] matrix) {
        // 첫번째 행과 열을 0을 기록하는 용도로 사용
        // 행과 열이 중복되는 (0,0)은 col0 변수에 기록
        int col0 = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0 && j == 0) {
                        matrix[0][0] = 0;
                        col0 = 0;
                        continue;
                    }
                    if (i == 0) {
                        matrix[0][0] = 0;
                        continue;
                    }
                    if (j == 0) {
                        col0 = 0;
                        continue;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        // 0 삽입
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        
        if (col0 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}