package Lecture9;
import java.util.Scanner;
public class MaxofthreeVoid {
    public static void max(int a, int b, int c){

  if (a>b && a>c){
    System.out.println("a is maximum");
}
else if(b>a && b>c){
    System.out.println("b is maximum");

}
else{
    System.out.println("c is maximum");
}
}
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    max(a,b,c);

    
    }

}
