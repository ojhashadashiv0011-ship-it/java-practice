import java.util.Scanner;

public class arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows :- ");
        int rows = sc.nextInt();
        System.out.print("Enter yours cols :- ");
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];
        boolean found = false;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter your targeted value:- ");
        int x = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if (numbers[i][j] == x) {
                    System.out.println("x found at (" + i +", "+ j +")");
                    found = true;
                }
            }
        }
        if (found == false) {
                System.out.println("Number not found");
            }
        sc.close();
    }
}
