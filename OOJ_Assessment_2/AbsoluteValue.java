public class AbsoluteValue {
    public static void main(String[] args) {
        int num = -10;

        int absValue = num < 0 ? -num : num;

        System.out.println("The absolute value of " + num + " is: " + absValue);
    }
}
