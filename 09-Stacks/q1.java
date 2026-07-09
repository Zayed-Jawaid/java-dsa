import java.util.Scanner;

public class q1 {
    static int[] arr = new int[5];
    static int top = -1;

    public static void push(int value) {
        if (top >= -1 && top < arr.length - 1) {
            top++;
            arr[top] = value;
            System.out.println("Pushed Successfully");
        } else
            System.out.println("Overflow");
    }

    public static void pop() {
        if (top < 0)
            System.out.println("Underflow");
        else {
            System.out.println("Popped Successfully: " + arr[top]);
            top--;
        }
    }

    public static void peek() {
        if (top > -1 && top < arr.length)
            System.out.println("Peeked Successfully: " + arr[top]);
        else
            System.out.println("Error, no element");
    }

    public static void isEmpty() {
        if (top == -1)
            System.out.println("It is indeed empty.");
        else
            System.out.println("It is not empty.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.println(
                    "Write 1 for push, 2 for pop, 3 for peek and 4 for isEmpty and any key to terminate program(twice)");
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("Enter element to push");
                int value = sc.nextInt();
                push(value);
            } else if (x == 2) {
                pop();
            } else if (x == 3) {
                peek();
            } else if (x == 4) {
                isEmpty();
            } else {
                System.out.println("Program Terminated !");
                System.exit(0);
            }
        }
        sc.close();
    }
}