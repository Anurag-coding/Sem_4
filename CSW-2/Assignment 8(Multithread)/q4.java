class MatrixMultiplication extends Thread {
    int[][] A, B, C;
    int row;
    MatrixMultiplication(int[][] A, int[][] B, int[][] C, int row) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
    }
    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            C[row][j] = 0;
            for (int k = 0; k < B.length; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }
        }
    }
}
public class q4 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Rows of A and columns of B define size of result matrix C
        int rowsA = A.length;
        int colsB = B[0].length;
        int[][] C = new int[rowsA][colsB];

        // Create and start threads for each row
        MatrixMultiplication[] threads = new MatrixMultiplication[rowsA];
        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MatrixMultiplication(A, B, C, i);
            threads[i].start();
        }
        for (int i = 0; i < rowsA; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Display result matrix
        System.out.println("Resultant Matrix (A x B):");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/* output:-
   Resultant Matrix (A x B):
   58      64
   139     154
*/
