import java.util.Scanner;

public class question22a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        num = Math.abs(num);

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
