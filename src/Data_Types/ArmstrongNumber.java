package Data_Types;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int digitCount = 0;

        
        while (originalNumber != 0) {
            digitCount++;
            originalNumber /= 10;
        }

        int sum = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, digitCount);
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}