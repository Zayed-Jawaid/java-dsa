import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income amount: ");
        double income = sc.nextDouble();
        if (income >= 1000000) {
            System.out.println("Tax : 30%");
        } else if (income >= 500000) {
            System.out.println("Tax : 20%");
        } else if (income >= 250000) {
            System.out.println("Tax : 5%");
        } else {
            System.out.println("No tax required !");
        }
        sc.close();
    }
}