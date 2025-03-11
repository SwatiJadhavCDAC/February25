public class DivisibleByThree {
    public static void main(String[] args) {
        int number = 9;
        boolean isDivisible = isDivisibleByThree(number);

        if (isDivisible) {
            System.out.println(number + " is divisible by 3.");
        } else {
            System.out.println(number + " is not divisible by 3.");
        }
    }

    public static boolean isDivisibleByThree(int n) {
        int oddCount = 0, evenCount = 0;

        if (n < 0) n = -n;
        if (n == 0) return true;
        if (n == 1) return false;

        while (n != 0) {
            if ((n & 1) != 0) oddCount++;
            n >>= 1;
            if ((n & 1) != 0) evenCount++;
            n >>= 1;
        }

        return isDivisibleByThree(Math.abs(oddCount - evenCount));
    }
}
