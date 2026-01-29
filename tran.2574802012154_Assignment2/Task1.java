import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float no1, no2;
        System.out.print("Enter the first number :");
        no1 = scanner.nextFloat();
        System.out.print("Enter the second number :");
        no2 = scanner.nextFloat();
        System.out.println("Addition :"  + (no1 + no2));
        System.out.println("Subtraction :"  + (no1 - no2));
        System.out.println("Multiplication :"  + (no1 * no2));
        System.out.println("Division :"  + (no1 / no2));
    }
}
