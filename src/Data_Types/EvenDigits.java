package Data_Types;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                System.out.println(digit + " is an even digit.");
            }
            number /= 10;
        }
    }
}
