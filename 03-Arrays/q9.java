
//LeetCode #27 - Remove Element
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the value you wish to remove.");
        int val = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == val) {
                temp = arr[i];
                for (int j = i; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                arr[len - 1] = temp;
                len--;
            }
        }
        System.out.println("The final array : ");
        for (int x = 0; x < arr.length; x++)
            System.out.print(arr[x]);
        System.out.println();
        sc.close();
    }
}