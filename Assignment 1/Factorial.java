import java.util.Scanner;

class FactorialCalculator {

    // Method to calculate and display the factorial of a number
    void displayFactorial(int number) {
        int factorialResult = 1; // Initialize the result to 1
        
        // Loop through numbers from 1 to the given number
        for (int currentMultiplier = 1; currentMultiplier <= number; currentMultiplier++) {
            factorialResult *= currentMultiplier; // Multiply the result by the current number
        }
        
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }
}

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int inputNumber = scanner.nextInt(); // Read the input number
        
        FactorialCalculator calculator = new FactorialCalculator(); // Create object
        calculator.displayFactorial(inputNumber); // Call the method to display factorial
        
        scanner.close(); // Close the scanner
    }
}
