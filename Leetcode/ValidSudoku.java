package Leetcode;

import javax.management.relation.Role;

public class ValidSudoku {
    public static boolean validSudokuSolver(String board[][]) {
        int row;
        int col;

        // for row searching
        for (col = 0; col < board.length; col++) {
            for (col = 0; col < board[0].length; col++) {
                String curr = board[col][col]; // 2, 4, 6, 8, 10
    
                for (col = col + 1; col < board[0].length; col++) {
                    if(curr==board[col][col]){
                        return false;
                    }
                }
            }
        }

        // for column searching
        for (col = 0; col < board[0].length; col++) {
            for (row = 0; row < board.length; row++) {
                String curr = board[row][col]; // 2, 4, 6, 8, 10
    
                for (col = col + 1; col < board[0].length; col++) {
                    if(curr==board[row][col]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String board[][] =    { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                                { "6", ".", ".", "1", "9", "5", ".", ".", "." },
                                { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                                { "8", ".", ".", ".", "6", ".", ".", ".", "3" },
                                { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                                { "7", ".", ".", ".", "2", ".", ".", ".", "6" },
                                { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                                { ".", ".", ".", "4", "1", "9", ".", ".", "5" },
                                { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };
    }
}
