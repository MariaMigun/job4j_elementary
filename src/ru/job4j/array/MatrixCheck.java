package ru.job4j.array;

public class MatrixCheck {
        public static boolean monoHorizontal(char[][] board, int row) {
            boolean result = false;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == 'X') {
                    result = true;
                    break;
                }
            }
            return result;
        }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] == 'X') {
                result = true;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (row == cell) {
                    rsl[row] = board[row][cell];
                }
            }
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                result = MatrixCheck.monoHorizontal(board, index) || MatrixCheck.monoVertical(board, index);
                break;
            }
        }
        return result;
    }
}
