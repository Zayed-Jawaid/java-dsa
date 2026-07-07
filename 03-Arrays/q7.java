
//Merge Two Sorted Arrays
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the integer array.");
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len1; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter the length of the integer array.");
        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len2; i++)
            arr2[i] = sc.nextInt();
        int len = len1 + len2;
        int arr[] = new int[len];
        int i = 0;
        int j = 0;
        int temp = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                arr[temp] = arr1[i];
                temp++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                arr[temp] = arr2[j];
                temp++;
                j++;
            } else {
                arr[temp] = arr1[i];
                arr[temp + 1] = arr2[j];
                temp += 2;
                i++;
                j++;
            }
        }
        while (i < len1 && j == len2) {
            arr[temp] = arr1[i];
            temp++;
            i++;
        }
        while (j < len2 && i == len1) {
            arr[temp] = arr2[j];
            temp++;
            j++;
        }
        System.out.println("The final merged array : ");
        for (int x = 0; x < len; x++)
            System.out.print(arr[x]);
        System.out.println();
        sc.close();
    }
}