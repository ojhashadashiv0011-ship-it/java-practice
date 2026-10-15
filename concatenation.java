import java.util.Scanner;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your firstname:- ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name:- ");
        String lastName = sc.nextLine();

        System.out.println("Your name is " + firstName + " " + lastName);
        sc.close();
    }
}
