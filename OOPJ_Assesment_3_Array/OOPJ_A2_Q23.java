import java.util.Scanner;


class OOPJ_A2_Q23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        if (m != p) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[p][q];
        int[][] result = new int[n][q];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}