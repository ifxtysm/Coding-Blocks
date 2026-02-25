package Lecture6;

import java.util.Scanner;

public class Mirrorpattern {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int star =1;
        int i = 1;
        while(i<=2*n-1){
            int j =1;
            while (j<=star){
                System.out.print("*");
                j++;
            }
            System.out.println();
            if(i<n){
                star++;
            }else{
                star--;
            }i++;
            
            }
        }
    
}
