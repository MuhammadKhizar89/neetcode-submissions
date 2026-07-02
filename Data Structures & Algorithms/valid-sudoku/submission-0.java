class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (hs.contains(board[i][j]))
                    return false;
                hs.add(board[i][j]);
            }
            hs.clear();
        }
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.')
                    continue;
                if (hs.contains(board[i][j]))
                    return false;
                hs.add(board[i][j]);
            }
            hs.clear();
        }
        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (k / 3) * 3 + i;
                    int col = (k % 3) * 3 + j;
                      if (board[row][col] == '.') continue;
                    if (hs.contains(board[row][col]))
                        return false;
                    hs.add(board[row][col]);
                }
            }
            hs.clear();
        }
        return true;
    }
}
