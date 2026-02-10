class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if(numRows == 1 || len <= 1) return s;

        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder(); 
        }

        int row = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            arr[row].append(c);

            // 현재 행이 처음이거나 마지막이면 방향 전환
            if(row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            }
            row += goingDown ? 1 : -1;
        }
        
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : arr) {
            result.append(sb);
        }
        return result.toString();
    }
}