package Data_Types;

import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int square = n * n;
        int count = 0;
        int temp = square;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int sum = 0;
        int divisor = 1;
        for (int i = 1; i < count; i++) {
            divisor *= 10;
        }
        while (divisor > 0) {
            int num = square / divisor;
            square %= divisor;
            divisor /= 10;
            if (num > 0 && square > 0) {
                sum = num + square;
                if (sum == n) {
                    System.out.println(n + " is a Kaprekar number.");
                    return;
                }
            }
        }
        System.out.println(n + " is not a Kaprekar number.");
    }
}
