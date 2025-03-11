import java.util.Scanner;


class OOPJ_A2_Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}