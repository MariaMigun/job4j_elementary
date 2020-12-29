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
}
