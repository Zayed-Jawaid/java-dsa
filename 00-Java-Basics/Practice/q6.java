import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for the 3 subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = a + b + c;
        if (total >= 40 && a >= 30 && b >= 30 && c >= 30) {
            System.out.println("Pass !");
        } else {
            System.out.println("Fail..");
        }
        sc.close();
    }
}