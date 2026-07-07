
//Move All Zeros to the End
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < len; j++) {
                    if (arr[j] == 0) {
                        arr[j] = arr[i];
                        arr[i] = 0;
                    }
                }
            }
        }
        System.out.println("The new array is : ");
        for (int i = 0; i < len; i++)
            System.out.print(arr[i]);
        System.out.println();
        sc.close();
    }
}