
//LeetCode #26 - Remove Duplicates from Sorted Array.
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                for (int j = i; j < len - 1; j++)
                    arr[j] = arr[j + 1];
                i--;
                len--;
            }
        }
        System.out.println("The final array : ");
        for (int x = 0; x < len; x++)
            System.out.print(arr[x]);
        System.out.println();
        sc.close();
    }
}