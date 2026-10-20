public class clearsBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notMask = ~(bitMask);
        int newNumber = n & notMask;
System.out.println(newNumber);
    }
}
