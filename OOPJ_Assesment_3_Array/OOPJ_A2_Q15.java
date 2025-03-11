import java.util.Scanner;

class OOPJ_A2_Q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        findSubArraysWithZeroSum(nums1);

        int[] nums2 = {1, 2, -3, 4, 5, 6};
        findSubArraysWithZeroSum(nums2);

        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};
        findSubArraysWithZeroSum(nums3);

        scanner.close();
    }

    public static void findSubArraysWithZeroSum(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == 0) {
                    System.out.print("Sub-array with 0 sum: ");
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}