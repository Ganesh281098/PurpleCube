package Data_Types;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int sum = 0;
        int count = Integer.toString(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            count--;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is a disarium number.");
        } else {
            System.out.println(n + " is not a disarium number.");
        }
    }
}

