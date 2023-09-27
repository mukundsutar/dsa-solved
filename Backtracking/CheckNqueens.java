package Backtracking;

public class CheckNqueens {
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal top left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal top right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueensProblem(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            return true;
        }

        // recursion kaam
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';

                if (nQueensProblem(board, row + 1)) {
                    return true;
                }

                board[row][i] = 'x';
            }
        }

        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----------Chessboard-----------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        if (nQueensProblem(board, 0)) {
            System.out.println("Solution Exists...");
            printBoard(board);
        } else {
            System.out.println("Solution does not Exists");
        }
    }
}
