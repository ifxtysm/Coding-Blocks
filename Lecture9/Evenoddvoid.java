package Lecture9;
import java.util.Scanner;
public class Evenoddvoid {
    
    public static void even_odd(int num1) {
        if (num1%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a= sc.nextInt();
            even_odd(a);
        }
    }