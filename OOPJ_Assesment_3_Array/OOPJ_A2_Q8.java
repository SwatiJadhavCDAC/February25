import java.util.Scanner;


class OOPJ_A2_Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int i = 0, j = 0, k = 0;
        int[] result = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        for (int x = 0; x < n1 + n2; x++) {
            System.out.print(result[x] + " ");
        }

        scanner.close();
    }
}