import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        float km = sc.nextFloat();
        float miles = (km * 621) / 1000;
        System.out.println("The distance in miles = " + miles);
        sc.close();
    }
}
