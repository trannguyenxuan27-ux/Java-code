import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");

        sc.close();
    }
}

