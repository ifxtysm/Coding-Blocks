package Lecture11;
import java.util.Scanner;
public class LeftShift {
    
    public static void leftShift(int[] arr) {

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];

        arr[arr.length - 1] = first;

        System.out.println("Array after Left Shift:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        leftShift(arr);

        sc.close();
    }
}
