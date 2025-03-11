import java.util.Scanner;

class OOPJ_A2_Q25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][n - i - 1];
        }

        System.out.println("Diagonal Sum 1: " + diagonalSum1);
        System.out.println("Diagonal Sum 2: " + diagonalSum2);

        scanner.close();
    }
}
