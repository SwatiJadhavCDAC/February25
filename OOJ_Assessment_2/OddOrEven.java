import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        String result = (number & 1) == 1 ? "Odd" : "Even";

        System.out.println("The number is " + result);
    }
}
