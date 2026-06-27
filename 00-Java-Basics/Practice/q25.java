import java.util.Scanner;

public class q25 {
    static void pattern(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern :");
        int x = sc.nextInt();
        pattern(x);
        sc.close();
    }
}