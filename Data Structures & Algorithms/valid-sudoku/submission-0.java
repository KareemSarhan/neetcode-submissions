class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValidrows(board) && isValidCols(board) && isValidsquares(board);
    }
    public boolean isValidrows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] line = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char val = board[j][i];
                if (val != '.') {
                    if (line[val-'1'] == true) {
                        return false;
                    } else {
                        line[val-'1'] = true;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidCols(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] line = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (line[val-'1'] == true) {
                        return false;
                    } else {
                        line[val-'1'] = true;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidsquares(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean[] line = new boolean[9];
                for (int i2 = 0; i2 < 3; i2++) {
                    for (int j2 = 0; j2 < 3; j2++) {
                        char val = board[i*3+i2][j*3+j2];
                        if (val != '.') {
                            if (line[val-'1'] == true) {
                                return false;
                            } else {
                                line[val-'1'] = true;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
