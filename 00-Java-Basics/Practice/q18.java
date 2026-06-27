import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search it: ");
        float num = sc.nextFloat();
        float[] arr = { 3, 5, 7, 9, 11 };
        int c = 0;
        for (int i = 0; i < 5; i++) {
            if (num == arr[i]) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("Number is not present in the array..");
        } else {
            System.out.println("Number is present in the array !");
        }
        sc.close();
    }
}