import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String name1,name2,name3 ;
        int score1,score2,score3 ;

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter name for student 1: "); 
        name1 = scanner.nextLine();
        System.out.print("Enter score for student 1: ");
        score1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name for student 2: ");
        name2 = scanner.nextLine();
        System.out.print("Enter score for student 2: ");
        score2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name for student 3: ");
        name3 = scanner.nextLine();
        System.out.print("Enter score for student 3: ");
        score3 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("--- Student Scores --- %n");
        System.out.printf("%-10s %5s%n", name1, score1);
        System.out.printf("%-10s %5s%n", name2, score2 );
        System.out.printf("%-10s %5s%n", name3, score3 );
        System.out.println("-------------------" );
        scanner.close();
    }
}