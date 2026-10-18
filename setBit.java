public class setBit {
    public static void main(String[] args) {
        int n = 9;
int pos = 1;

int bitMask = 1 << pos;
int newNumber = n | bitMask;

System.out.println(newNumber);
    }
}
