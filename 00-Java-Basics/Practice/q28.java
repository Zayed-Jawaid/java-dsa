import java.util.Scanner;

public class q28 {
    static int fib(int a) {
        if (a == 1) {
            return 0;
        }
        if (a == 2) {
            return 1;
        }
        return fib(a - 1) + fib(a - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number:");
        int x = sc.nextInt();
        int temp = fib(x);
        System.out.println("The number is " + temp);
        sc.close();
    }
}