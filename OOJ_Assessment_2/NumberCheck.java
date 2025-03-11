public class NumberCheck {
    public static void main(String[] args) {
        int num = 0;

        String result = (num > 0) ? "positive" : ((num < 0) ? "negative" : "zero");

        System.out.println("The number is " + result);
    }
}
