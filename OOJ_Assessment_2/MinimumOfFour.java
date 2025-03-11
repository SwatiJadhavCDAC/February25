public class MinimumOfFour {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int d = 15;

        int min = a < b ? (a < c ? (a < d ? a : d) : (c < d ? c : d)) : (b < c ? (b < d ? b : d) : (c < d ? c : d));

        System.out.println("The minimum number is: " + min);
    }
}
