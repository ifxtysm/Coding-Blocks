package Lecture11;
import java.util.Scanner;
public class SwapTwoArithmetic {

    public static void swapNumbers(int a, int b) {

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        swapNumbers(a, b);

        sc.close();
    }
}
