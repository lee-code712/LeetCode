class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                order.add(matrix[i][0]);
            }
            return order;
        }
        
        int start = 0;
        List<Integer> tmp = new ArrayList<>();
        while (order.size() < (matrix.length * matrix[0].length)) {
            for (int i = start; i < matrix.length - start; i++) {
                // 첫번째 행
                if (i == start) {
                    for (int j = start; j < matrix[start].length - start; j++) {
                        order.add(matrix[i][j]);
                    }
                    continue;
                }
                // 마지막 행
                if (i == matrix.length - 1 - start) {
                    for (int j = matrix[i].length - 1 - start; j >= start; j--) {
                        order.add(matrix[i][j]);
                    }
                    break;
                }
                // 중간 행
                order.add(matrix[i][matrix[i].length - 1 - start]);
                if (start != matrix[i].length - 1 - start) {
                    tmp.add(matrix[i][start]);    
                }
            }
            for (int i = tmp.size() - 1; i >= 0; i--) {
                order.add(tmp.get(i));
            }

            tmp.clear();
            start++;
        }
        
        return order;
    }
}