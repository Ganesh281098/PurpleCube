package Test1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

// Q14
