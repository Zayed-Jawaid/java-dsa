import java.util.Scanner;

//Here we are taking the sort as ascending order not descending.
public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
            if (i > 0) {
                if (arr[i] >= arr[i - 1]) {
                } else {
                    c++;
                }
            }
        }
        if (c > 0) {
            System.out.println("Not a sorted array.");
        } else {
            System.out.println("It is a sorted array.");
        }
        sc.close();
    }
}