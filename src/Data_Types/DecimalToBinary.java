package Data_Types;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        int binary[] = new int[32];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal /= 2;
        }
        System.out.print("Binary representation: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}

