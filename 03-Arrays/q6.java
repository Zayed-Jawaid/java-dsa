
//Find Minimum Element
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        int min = arr[len - 1];
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("The smallest number in the array is : " + min);
        sc.close();
    }
}