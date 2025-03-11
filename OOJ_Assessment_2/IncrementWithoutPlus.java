public class IncrementWithoutPlus {
    public static void main(String[] args) {
        int x = 5;

        int result = -~x;

        System.out.println("Original number: " + x);
        System.out.println("Incremented number: " + result);
    }
}
