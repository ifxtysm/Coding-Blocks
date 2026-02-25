package Lecture11;
import java.util.Scanner;
public class RightShift {

    public static void rightShift(int[] arr) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];

        arr[0] = last;

        System.out.println("Array after Right Shift:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        rightShift(arr);

        sc.close();
    }
}  
