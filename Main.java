public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
int count = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] >= 15) {
        count++;
    }
}

System.out.println(count);
    }
}
