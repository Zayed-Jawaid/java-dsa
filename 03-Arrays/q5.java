
//Count Occurrences of an Element
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the target element you want to find the occurence of : ");
        int target = sc.nextInt();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == target)
                count++;
        }
        if (count == 0)
            System.out.println("Target is not present in the array.");
        else
            System.out.println("The number of times the target appeared in the array is : " + count);
        sc.close();
    }
}