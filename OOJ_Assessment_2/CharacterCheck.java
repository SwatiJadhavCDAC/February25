public class CharacterCheck {
    public static void main(String[] args) {
        char ch = 'A'; 

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";

        System.out.println("The character '" + ch + "' is: " + result);
    }
}
