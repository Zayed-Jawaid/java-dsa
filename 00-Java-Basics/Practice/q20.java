import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out
                .println("Enter the size of both arrays (they both must be equal in length, first rows then columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element for array 1 in row " + (i + 1) + " and column " + (j + 1) + " :");
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element for array 2 in row " + (i + 1) + " and column " + (j + 1) + " :");
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}