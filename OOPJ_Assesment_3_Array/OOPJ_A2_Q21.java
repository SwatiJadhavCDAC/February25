import java.util.Scanner;

class OOPJ_A2_Q21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        for (int j = 0; j < m; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }

        scanner.close();
    }
}
