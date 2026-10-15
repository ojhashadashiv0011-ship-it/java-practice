import java.util.Scanner;

public class question44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number :- ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversed = 0;

        
        int n = Math.abs(num);

        while (n > 0) {
            int lastDigit = n % 10;                
            reversed = (reversed * 10) + lastDigit; 
            n = n / 10;                            
        }

        
        if (num < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed Number: " + reversed);

        sc.close();
    }
}
