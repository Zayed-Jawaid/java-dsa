import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int[] rev = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
            rev[length - i - 1] = arr[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(rev[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}