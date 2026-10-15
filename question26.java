import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of terms: ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int count = 0;
        while (count < num) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }
        sc.close();
    }
}
