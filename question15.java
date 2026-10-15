import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println("All number is equal");
        }

        else if (num1 >= num2 && num1 >= num3) {
            System.out.print("First number is greater " + num1);
        }else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Second number is greater " + num2);
        }else if (num3 >= num1 && num3 >= num2) {
            System.out.println("Third number is greater " + num3);
        }
        sc.close();
    }
}
