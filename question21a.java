import java.util.Scanner;

public class question21a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int count = 0;

        if (num == 0) {
            count = 1;
        }else{
            num = Math.abs(num);

            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Numbers = " + originalNum);
        System.out.println("Numbers of digits = " + count);
        sc.close();
    }
}
