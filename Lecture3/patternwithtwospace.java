package Lecture3;

import java.util.Scanner;

public class patternwithtwospace {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int space = 0;
        int star = n;
        int row = 1;

        while (row<=n){
            //spaces
            int i = 1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
System.out.println();
space=space+2;
star--;
row++;
        }
    }
}