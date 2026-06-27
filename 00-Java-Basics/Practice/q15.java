import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want a factorial of : ");
        int n = sc.nextInt();
        int fact = 1;
        System.out.print("Factorial of " + n + " is: ");
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        sc.close();
    }
}