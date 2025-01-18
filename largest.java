import java.util.Scanner;

class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 random 3-digit numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 100 || numbers[i] > 999) {
                System.out.println("Invalid input. Please enter a 3-digit number.");
                i--; // Retry for invalid input
            }
        }

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
