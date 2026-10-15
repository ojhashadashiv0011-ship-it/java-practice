import java.util.Scanner;

public class question24a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Not Palindrome " + num);
        }else{
            int originalNum = num;
            int reserved = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                reserved = (reserved*10) + lastDigit;
                num = num / 10;
            }
            if (originalNum == reserved) {
                System.out.println("Palindrome " + originalNum);
            }else{
                System.out.println("Not Palindrome " + originalNum);
            }
        }
        sc.close();
    }
}
