import java.util.Scanner;

public class q24 {
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the table of : ");
        int a = sc.nextInt();
        table(a);
        sc.close();
    }
}