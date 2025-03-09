import java.util.Random;

class RandomNumbers {
    void Display_RandomNumbers() {
        Random rand = new Random();
        System.out.println("5 Random Numbers between 1 to 100 are:");
        for (int i = 1; i <= 5; i++) {
            int randomNumber = rand.nextInt(100) + 1; 
            System.out.println("Random Number " + i + ": " + randomNumber);
        }
    }
}

class Random {
    public static void main(String[] args) {
        RandomNumbers obj = new RandomNumbers();
        obj.Display_RandomNumbers();
    }
}
