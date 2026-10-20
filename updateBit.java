import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your operation:- ");
        int operation = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask =1<<pos;
        if (operation == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
