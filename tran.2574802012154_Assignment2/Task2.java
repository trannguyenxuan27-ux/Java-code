import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radius;
        System.out.print("Enter the radius of the circle :");
        radius = scanner.nextFloat();
        System.out.println("Area of the circle:" + (Math.PI * radius * radius));
        System.out.println("Circumference of the circle:" + (2 * Math.PI * radius));
    }     
}
