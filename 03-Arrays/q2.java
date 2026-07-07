
//Second Largest Distinct Element
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 1; i < len; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest)
                secondlargest = arr[i];
        }
        System.out.println("The Second Largest Element in the array : " + secondlargest);
        sc.close();
    }
}