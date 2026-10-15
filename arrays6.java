import java.util.Scanner;

public class arrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter arrays size:- ");
        int size = sc.nextInt();
        int num[] = new int[size];


        System.out.println("Enter your numbers:- ");
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }
        int min = num[0];
        for(int i = 0; i < size; i++){
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Minimum number is " + min);
        sc.close();
    }
}
