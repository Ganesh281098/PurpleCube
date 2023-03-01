package Test1;

import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        input.close();
        if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
            System.out.println(num1 + " and " + num2 + " are twin primes.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not twin primes.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Q10