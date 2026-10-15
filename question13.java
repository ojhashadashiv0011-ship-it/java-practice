import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("positive");
        }else if (num < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        sc.close();
    }
}
