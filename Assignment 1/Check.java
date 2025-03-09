import java.util.Scanner;

class PrimeSum {

    // Method to check if a number is prime
    boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int divisor = 2; divisor * divisor <= number; divisor++) 
            if (number % divisor == 0) return false;
        return true;
    }

    // Method to check if a number can be expressed as the sum of two primes
    void checkPrimeSum(int targetNumber) {
        for (int firstPrime = 2; firstPrime <= targetNumber / 2; firstPrime++) 
            if (isPrime(firstPrime) && isPrime(targetNumber - firstPrime)) {
                System.out.println(targetNumber + " = " + firstPrime + " + " + (targetNumber - firstPrime));
                return;
            }
        System.out.println(targetNumber + " cannot be expressed as the sum of two primes.");
    }
}

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        new PrimeSum().checkPrimeSum(inputNumber); // Create object and call method
        scanner.close();
    }
}
