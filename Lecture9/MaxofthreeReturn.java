package Lecture9;
import java.util.Scanner;
public class MaxofthreeReturn {
    
    public static int max(int a, int b , int c){
if (a>b && a>c){
    return 1;
}
else if(b>a && b>c){
    return 2;

}
else{
    return 3;
}
}
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x= max(a,b,c);

    if(x==1){
        System.out.println("a is maximum");
    }
    else if(x==2){
        System.out.println("b is maximum");
    }
    else {
            System.out.println("c is maximum");

    }
    sc.close();

}


}
