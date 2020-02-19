import java.util.*;


public class Main {

    public static void main(String[] args) {

        NQueen nq = new NQueen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter board dimension: ");

        // N = dimension
        nq.N = scan.nextInt();
        int[][] board = new int[nq.N][nq.N];
        if (!nq.solveBoard(board, 0))
            System.out.println("Solution not found");
        nq.print(board);
    }

}
