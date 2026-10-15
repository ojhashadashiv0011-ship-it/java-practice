import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year " + year);
        }else{
            System.out.println("Normal year " + year);
        }
        sc.close();
    }
}
