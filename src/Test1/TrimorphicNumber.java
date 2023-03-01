package Test1;

import java.util.Scanner;

public class TrimorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int cube = num * num * num;
        String numStr = Integer.toString(num);
        String cubeStr = Integer.toString(cube);
        if (cubeStr.endsWith(numStr)) {
            System.out.println("The number is a trimorphic number.");
        } else {
            System.out.println("The number is not a trimorphic number.");
        }
    }
}


// Q5 write a java program to check given number is trimorphic  number or not
//4 is trimorphic number as its cube (64) contains 4  at the end .
// 5 is trimorphic number as its cube (625)contains 5 at the end.
