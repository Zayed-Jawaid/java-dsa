import java.util.Scanner;

public class q27 {
    static void pattern(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= (a - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern :");
        int x = sc.nextInt();
        pattern(x);
        sc.close();
    }
}