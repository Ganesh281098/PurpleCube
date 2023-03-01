package Test1;

public class NumberPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                // even number, print as it is
                System.out.print(i + " ");
            } else {
                // odd number, print negative value with square
                int neg = -i;
                int square = i * i;
                System.out.print(neg + "^2=" + square + " ");
            }
        }
    }
}

// 12
