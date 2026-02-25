import java.util.Scanner;

public class Nestedlottery {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n =sc.nextInt();

if(n>=300 && n<=460){
    System.out.println("Macbook won");
    if(n>=300 && n<=380){
    System.out.println("Model : M1 mac");
}
else if(n>=381 && n<=460){
    System.out.println("Model : M2 mac");

else if(n>=200 && n<=280){
    System.out.println("Kurkure won");
    if(n>=200 && n<=240){
    System.out.println("Flavour : chilli kurkure");
    }
    else if(n>=241 && n<=280){
    System.out.println("Flavour : onion Kurkure");
    }
else if(n>=1100 && n<=1500){
    System.out.println("Cycle won");
    }
    else if(n>=1100 && n<=1300){
    System.out.println("Brand : Avon cycle");
}
else if (n>= 1301 and n <= 1500){
    System.out.println("Brand : Hero Cycle"):
}
