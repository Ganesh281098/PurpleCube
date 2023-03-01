package Data_Types;

import java.util.Scanner;

public class SumOfOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("The sum of odd digits in the number is: " + sum);
    }
}

