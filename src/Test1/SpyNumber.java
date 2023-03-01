package Test1;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        
        if (sum == product) {
            System.out.println("The number is a spy number.");
        } else {
            System.out.println("The number is not a spy number.");
        }
    }
}

// Q3 write a java program to check given number is spy number or not
//e.g 123 if sum of digit is equals to product of digit the number is spy       number
//i.e 123=1+2+3=6 and 1*2*3=6 so the number is spy  number