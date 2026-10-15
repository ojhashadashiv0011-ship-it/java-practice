import java.util.Scanner;

public class question23a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = (reversed*10) + lastDigit;
            temp = temp / 10;
        }
        System.out.println(reversed);
        sc.close();
    }
}
