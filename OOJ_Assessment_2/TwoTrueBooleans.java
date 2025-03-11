public class TwoTrueBooleans {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        boolean result = (a && b) || (a && c) || (b && c);

        System.out.println("At least two booleans are true: " + result);
    }
}
