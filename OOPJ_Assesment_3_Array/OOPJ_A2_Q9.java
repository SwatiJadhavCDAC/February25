import java.util.Scanner;

class OOPJ_A2_Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        int missingNumber = totalSum - sum;
        System.out.println(missingNumber);

        scanner.close();
    }
}