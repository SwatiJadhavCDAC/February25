public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 13;
        
        if ((n & 1) == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}
