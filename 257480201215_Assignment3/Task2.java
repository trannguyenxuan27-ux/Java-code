import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("--- Results ---");
        System.out.printf("%-15s: %.2f%n", "Addition", addition);
        System.out.printf("%-15s: %.2f%n", "Subtraction", subtraction);
        System.out.printf("%-15s: %.2f%n", "Multiplication", multiplication);
        System.out.printf("%-15s: %.2f%n", "Division", division);

        scanner.close();
    }
}

