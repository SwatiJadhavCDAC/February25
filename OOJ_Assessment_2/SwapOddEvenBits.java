public class SwapOddEvenBits {
    public static void main(String[] args) {
        int x = 23;

        int oddMask = 0xAAAAAAAA;
        int evenMask = 0x55555555;

        int swapped = ((x & oddMask) >> 1) | ((x & evenMask) << 1);

        System.out.println("Original number: " + x);
        System.out.println("Number after swapping odd and even bits: " + swapped);
    }
}
