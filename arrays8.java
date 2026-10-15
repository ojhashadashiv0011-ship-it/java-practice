import java.util.Scanner;

public class arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrays size :- ");
        int size =sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter your number :");

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter targeted value: ");

        int x = sc.nextInt();

        for(int i = 0; i < size; i++){
            if (numbers[i] == x) {
                System.out.println("x found " + i);
            }
        }
        sc.close();
    }
}
