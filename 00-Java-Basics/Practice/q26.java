import java.util.Scanner;

public class q26 {
    static int sum(int a, int total) {
        total += a;
        if (a > 0) {
            return sum(a - 1, total);
        } else {
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number to calculate the sum till (for natural numbers) :");
        int x = sc.nextInt();
        int total = 0;
        System.out.println("The sum of first " + x + " natural numbers is equal to " + sum(x, total));
        sc.close();
    }
}