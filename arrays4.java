import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum = sum + marks[i];
        }

        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}
