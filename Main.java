import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = scanner.next();
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " Palindrome");
        } else {
            System.out.println(original + " Not Palindrome");
        }

        scanner.close();
    }
}
