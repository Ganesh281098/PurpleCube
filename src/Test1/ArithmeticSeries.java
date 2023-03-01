package Test1;

public class ArithmeticSeries {
    public static void main(String[] args) {
        int n = 10; 
        int a = 2; 
        int d1 = 10; 
        int d2 = 4; 
        
        int term = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += (d1 + i * d2);
        }
    }
}

// Q 11