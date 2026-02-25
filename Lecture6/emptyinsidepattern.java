package Lecture6;
import java.util.Scanner;
public class emptyinsidepattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int space=1;
int star=n-1;
int row=1;

while(row<=2*n-1){
    int i=1;
    while(i<=star){
        System.out.print("* ");
        i++;
    }
    int j=1;
    while(j<=space){
        System.out.print("  ");
j++;
    }
    int k=1;
    while(k<=star){
        System.out.print("* ");
        k++;
    }
    System.out.println();
    if(row<n){
    star--;
    space+=2;
    }
    else{
        star++;
        space-=2;
    }
    row++;
    }
}
}
