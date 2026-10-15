import java.util.Scanner;

public class question30 {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println(isEven(num));
        sc.close();
    }
}
