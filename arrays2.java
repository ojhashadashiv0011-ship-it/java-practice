import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int abc = sc.nextInt();
        int marks[] = new int[abc];
        for(int i = 0; i < abc; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        // for(int i = 1; i < abc; i++){
        //     System.out.println(marks[0]);
        // System.out.println(marks[4]);
        // }
        
        sc.close();
    }
}
