package Lecture9;
import java.util.Scanner;
public class EvenoddusingReturn {
    
    public static int even_odd(int num1) {
        if (num1%2==0){
            return 1;
        }else{
            return 0;
        }
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a= sc.nextInt();
            int x = even_odd(a);
            if (x==1){
                System.out.print("even");
            }
                    else {
                        System.out.print("odd");                    }
        
            }
        }
