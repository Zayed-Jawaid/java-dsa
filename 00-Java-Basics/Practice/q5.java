import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double n = (int) num;
        if (num == n) {
            System.out.println("the number is an integer.");
        } else {
            System.out.println("The number is not an integer.");
        }
        sc.close();
    }
}