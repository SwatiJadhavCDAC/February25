import java.util.Scanner;


class OOPJ_A2_Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int S = scanner.nextInt();

        int start = 0, sum = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > S && start < end) {
                sum -= arr[start];
                start++;
            }

            if (sum == S) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            }
        }

        scanner.close();
    }
}