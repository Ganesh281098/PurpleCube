package Data_Types;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 10; i++) { 
            boolean isPrime = true;
            for (int j = 2; j < i; j++) { 
                if (i % j == 0) {  
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { // if i is prime, add it to the sum
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers between 1 and 10: " + sum);
    }
}
