
//Max. Element
import java.util.Scanner;

public class q1 {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements for the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest element in the array is: " + findMax(arr));
        sc.close();
    }
}