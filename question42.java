import java.util.Scanner;

public class question42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.print(fact);
        sc.close();
    }
}
