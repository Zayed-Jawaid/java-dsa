import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the value :");
            arr[i] = sc.nextFloat();
            sum += arr[i];
        }
        System.out.println("Sum of the elements = " + sum);
        sc.close();
    }
}