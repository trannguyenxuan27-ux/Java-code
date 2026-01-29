import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.print("Enter the value of x: ");
        x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        y = scanner.nextInt();
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: x = " + x + ", y = " + y);
        scanner.close();
    }
}
