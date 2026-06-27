import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even numbers you want the sum of: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < (n * 2); i += 2) {
            sum = sum + i;
        }
        System.out.println("Sum of the " + n + " numbers are: " + sum);
        sc.close();
    }
}