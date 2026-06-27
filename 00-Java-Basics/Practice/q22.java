import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i - 1]) {
                max = arr[i];
            }
        }
        for (int i = 1; i < len; i++) {
            if (arr[i] < arr[i - 1]) {
                min = arr[i];
            }
        }
        System.out.println("Largest Number = " + max + " and the Smallest Number = " + min);
        sc.close();
    }
}