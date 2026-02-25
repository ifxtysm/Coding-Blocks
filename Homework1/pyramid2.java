package HOMEWORK;

import java.util.Scanner;

public class pyramid2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int space = 0;
        int star = 2+n-1;
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
            space++;
            star-=2;
            row++;
        }

    }
    
}
