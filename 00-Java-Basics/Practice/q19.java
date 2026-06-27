import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        int[][] marks = new int[n][5];

        for (int i = 0; i < n; i++) {
            double avg = 0;
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter marks of student " + ((i + 1)) + " in subject " + (j + 1) + " :");
                marks[i][j] = sc.nextInt();
                avg += (double) marks[i][j];
            }
            System.out.println("The average of student " + i + " is = " + (avg / 5));
        }

        sc.close();
    }
}