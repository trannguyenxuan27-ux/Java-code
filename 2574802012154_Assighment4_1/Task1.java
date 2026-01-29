import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("This is a positive number");
        } else if (num < 0) {
            System.out.println("This is a negative number");
        }else {
            System.out.println("Zero");
        }
        sc.close();
    }
}