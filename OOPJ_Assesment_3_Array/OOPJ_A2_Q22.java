import java.util.Scanner;

class OOPJ_A2_Q22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum Element: " + max);

        scanner.close();
    }
}