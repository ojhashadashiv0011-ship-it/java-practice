import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();

        int mult = num1 * num2;
        System.out.println(mult);
        sc.close();
    }
}
