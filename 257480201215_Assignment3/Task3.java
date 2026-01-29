import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of item 1: ");
        String item1 = sc.nextLine();
        System.out.print("Enter the quantity of " + item1 + ": ");
        int qty1 = sc.nextInt();
        System.out.print("Enter the price of " + item1 + ": ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the name of item 2: ");
        String item2 = sc.nextLine();
        System.out.print("Enter the quantity of " + item2 + ": ");
        int qty2 = sc.nextInt();
        System.out.print("Enter the price of " + item2 + ": ");
        double price2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the name of item 3: ");
        String item3 = sc.nextLine();
        System.out.print("Enter the quantity of " + item3 + ": ");
        int qty3 = sc.nextInt();
        System.out.print("Enter the price of " + item3 + ": ");
        double price3 = sc.nextDouble();

        double total1 = qty1 * price1;
        double total2 = qty2 * price2;
        double total3 = qty3 * price3;
        double grandTotal = total1 + total2 + total3;

        System.out.println("\nReceipt");
        System.out.println("-----------------------------------");
        System.out.printf("%-10s %8s %12s %12s%n", "Item", "Quantity", "Price", "Total");
        System.out.printf("%-10s %8d %12s %12s%n", item1, qty1,
                String.format("$%.2f", price1), String.format("$%.2f", total1));
        System.out.printf("%-10s %8d %12s %12s%n", item2, qty2,
                String.format("$%.2f", price2), String.format("$%.2f", total2));
        System.out.printf("%-10s %8d %12s %12s%n", item3, qty3,
                String.format("$%.2f", price3), String.format("$%.2f", total3));
        System.out.println("-----------------------------------");
        System.out.printf("%-10s %36s%n", "Grand Total", String.format("$%.2f", grandTotal));

        sc.close();
    }
}
