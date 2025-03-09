class SumDivisibleBy7 {

    // Method to display numbers divisible by 7 and their sum
    void displaySum() {
        int sumOfDivisibleNumbers = 0;
        System.out.println("Numbers divisible by 7 between 100 and 200 are:");
        
        // Loop through numbers from 101 to 199
        for (int currentNumber = 101; currentNumber < 200; currentNumber++) {
            if (currentNumber % 7 == 0) {
                System.out.print(currentNumber + " "); // Print the divisible number
                sumOfDivisibleNumbers += currentNumber; // Add to the sum
            }
        }
        
        // Print the total sum
        System.out.println("\nSum of all numbers divisible by 7 is: " + sumOfDivisibleNumbers);
    }
}

public class DivisibleBy7 {
    public static void main(String[] args) {
        SumDivisibleBy7 calculator = new SumDivisibleBy7(); // Create object
        calculator.displaySum(); // Call the method
    }
}
