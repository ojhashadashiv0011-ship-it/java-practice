import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:- ");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter a number:- ");
        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i = 0; i < size; i++){
            System.out.println(marks[i]);
            
        }
        sc.close();
    }
}
