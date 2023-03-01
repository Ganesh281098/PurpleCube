package Data_Types;

import java.util.Scanner;

public class RangeFactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();
        sc.close();
        long sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += factorial(i);
        }
        System.out.println("The sum of factorials in the range [" + lowerBound + ", " + upperBound + "] is: " + sum);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

