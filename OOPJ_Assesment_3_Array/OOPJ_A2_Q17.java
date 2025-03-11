import java.util.Scanner;

class OOPJ_A2_Q17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxProduct = Integer.MIN_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    num1 = nums[i];
                    num2 = nums[j];
                }
            }
        }

        System.out.println("Pair is (" + num1 + ", " + num2 + "), Maximum Product: " + maxProduct);

        scanner.close();
    }
}