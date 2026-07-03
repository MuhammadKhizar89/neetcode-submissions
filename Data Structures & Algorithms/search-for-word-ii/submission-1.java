class Solution {
    public boolean backTrack(char[][] grid, String word, int i, int j, int k) {
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        int wl=word.length()-1;

        if (k < 0)
            return true;
        if (i > m || j > n || i < 0 || j < 0)
            return false;
        if (grid[i][j] == '#')
            return false;

        if (grid[i][j] == word.charAt(wl-k)) {
            char temp = grid[i][j];
            grid[i][j] = '#';

            boolean found = backTrack(grid, word, i + 1, j, k - 1)
                || backTrack(grid, word, i, j + 1, k - 1) || backTrack(grid, word, i, j - 1, k - 1)
                || backTrack(grid, word, i - 1, j, k - 1);
            grid[i][j] = temp;
            return found;
        }

        return false;
    }
    public List<String> findWords(char[][] board, String[] words) {
        // int m = board.length;
        // int n = board[0].length;
        List<String> list = new ArrayList<>();
        int flag = 0;
        for (String word : words) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0)
                        && backTrack(board, word, i, j, word.length() - 1)) {
                        list.add(word);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1)
                    break;
            }
            flag = 0;
        }
        return list;
    }
}