import java.util.Scanner;

public class question31 {
    public static int calculateProduct(int a, int b){
        
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Product of two number is : " + calculateProduct(a, b));
        sc.close();
    }
}
