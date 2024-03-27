import java.util.Scanner;

public class Factorial {
    //Finding factorial of a number entered by user
    static void factorial(int a){
        int l=1;
        for(int i=1; i<=a; i++){
            l=l*i;
        }
        System.out.print(l);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        factorial(sc.nextInt());
    }
}
