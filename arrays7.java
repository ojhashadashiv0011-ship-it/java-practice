import java.util.Scanner;

public class arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:- ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for(int i = 0; i < size; i++){
            if (num[i] % 2 == 0) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("ODD numbers: " + odd);
        sc.close();
    }
}
