public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int c = 12;

        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}
