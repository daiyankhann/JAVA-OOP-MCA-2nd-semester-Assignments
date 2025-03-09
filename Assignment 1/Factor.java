import java.util.Scanner;

class Factors {

    // Method to display factors of a number
    void displayFactors(int number) {
        System.out.print("Factors of " + number + " are: ");
        
        // Loop through numbers from 1 to the given number
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                System.out.print(divisor + " "); // Print the divisor if it's a factor
            }
        }
    }
}

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int inputNumber = scanner.nextInt(); // Read the input number
        
        Factors factorCalculator = new Factors(); // Create object
        factorCalculator.displayFactors(inputNumber); // Call the method to display factors
        
        scanner.close(); // Close the scanner
    }
}
