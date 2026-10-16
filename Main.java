import java.util.Scanner;

public class Main {
    public static int countVowels(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        int totalVowels = countVowels(word);
        System.out.println("Total vowels in \"" + word + "\": " + totalVowels);

        scanner.close();
    }
}
