
//Check if an Array is Sorted
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array. ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        for (int i = 1; i < len; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("Not a sorted array.");
                return;
            }
        }
        System.out.println("Sorted array.");
        sc.close();
    }
}