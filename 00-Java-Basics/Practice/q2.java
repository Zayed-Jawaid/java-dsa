import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the three subjects: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = (a + b + c) / 30;
        System.out.println("The CGPA is: " + sum);
        sc.close();
    }

}
