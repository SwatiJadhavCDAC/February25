public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;

        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println("Is " + n + " a power of 2? " + isPowerOfTwo);
    }
}
