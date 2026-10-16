import java.util.Scanner;

public class stringsBuilder2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word:- ");
        String originalWord = sc.next();

        StringBuilder sb = new StringBuilder(originalWord);
        sb.append("123");
        System.out.println(sb);

        System.out.println("Total Length of the word");
        System.out.println(sb.length());

        sc.close();
    }
}
