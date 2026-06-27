import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String site = sc.nextLine();
        if (site.endsWith(".com") == true) {
            System.out.println("Commercial Website.");
        } else if (site.endsWith(".org") == true) {
            System.out.println("Organization Website.");
        } else if (site.endsWith(".in") == true) {
            System.out.println("Indian Website.");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}