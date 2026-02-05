package Lecture1;
public class EvenNo {
   public static void main (String[] args) {
    int n = 1000;
    System.out.println("Even numbers from 1 to " + n + ":");
    for (int i = 2; i <= n; i += 2) {
        System.out.print(i + " ");
    }
   } 
}
