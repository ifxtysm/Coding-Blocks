package Lecture6;

import java.util.Scanner;

public class Numberpyramid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        int row = 1;

        while (row<=n){
            //spaces
            int i = 1;
            while (i<=space){
                System.out.print(" ");
                i++;
            }
            //star
            int j = 1;
            while(j<=star){
                System.out.print(row);
                j++;
            }
            System.out.println();
            space--;
            star+=2;
            row++;
        }   
}
}
