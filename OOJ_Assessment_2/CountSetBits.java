public class CountSetBits {
    public static void main(String[] args) {
        int n = 29;
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("The number of 1s (set bits) is: " + count);
    }
}
