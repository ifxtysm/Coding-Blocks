package Lecture8;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter num 1");
int a= sc.nextInt();

System.out.println("Enter num 2");
int b= sc.nextInt();
while(a%b!=0){
    int remainder=a%b;
    a=b;
    b=remainder;
}
System.out.println(b);
    }
    }

