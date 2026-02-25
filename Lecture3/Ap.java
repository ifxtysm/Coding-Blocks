//arithmetic progression
/*you have to take two variables as an input first term 'a' and common diff 'd'
you have to print ap series example - a is 1 d is 2
output 1 3 5 7 9 11 13 .....
 */
import java.util.Scanner;

public class Ap {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first term of the AP");
        int a = sc.nextInt();

        System.out.println("Enter the common difference in the AP");
        int d = sc.nextInt();

        for (int i = 0; i < 50; i++){
            a = a+d;
            System.out.println(a);

        }

    }
}