package HOMEWORK;

import java.util.Scanner;

public class pattern3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int row =1;
        while(row<=n){
            int j =n;
            while (j>=row){
                System.out.print("*");
                j--;
            }
            System.out.println();
            row ++;
        }
    }
    
}
