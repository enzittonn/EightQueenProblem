import java.util.Scanner;

public class NQueen {
    static Scanner scan;

    // Default value 4
    static int N = 4;


    public void print(int board[][]) {
        int i;
        for (i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print(" Q \t");
                } else
                    System.out.print(" - \t");
            }
            System.out.println("\n");
        }

    }

    public boolean placeQueen(int board[][], int row, int col) {
        int i, j;

        // check if queen is present

        // left
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        //top-left
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // bottom-left
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }



    public boolean solveBoard(int board[][], int col) {
        if (col >= N)
            return true;

        // i = row, j =
        for (int i = 0; i < N; i++) {
            // check if to place queen in i:th row in col
            // if queen is NOT placed at i:th row, move to the next row at same column
            // if queen is placed at i:th row, move to the next column
            if (placeQueen(board, i, col)) {
                board[i][col] = 1;
                //run recursively until whole board is exhausted.
                if (solveBoard(board, col + 1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }


}
