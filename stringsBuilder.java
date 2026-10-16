import java.util.Scanner;

public class stringsBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word:- ");
        String originalWord = sc.next();
        StringBuilder sb = new StringBuilder(originalWord);
        System.out.println(sb.reverse());
        sc.close();
    }
}
