package Lecture12;
import java.util.Scanner;
public class RotateArray{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the number of times to rotate: ");
        int k = sc.nextInt();
        for(int i =1; i<=k; i++){
        int last = arr[arr.length - 1];

        for (int j = arr.length - 1; j > 0; j--)
            arr[j] = arr[j - 1];

        arr[0] = last;
        }
        System.out.println("Array after Right Shift:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}