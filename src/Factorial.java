import java.util.Scanner;

public class Factorial {
    //Finding factorial of a number entered by user
    static void factorial(int a){
//        int l=1;
//        for(int i=1; i<=a; i++){
//            l=l*i;
//        }
//        System.out.print(l);
//        int factorial = 1; int x;
//
//        for (x=1; x<=a; x++) {
//            factorial = factorial * x;
//        }
//        System.out.println("The factorial of "+a+ " is "+factorial);
        int mul = 1;

        for(int i=a; i>0; i--)
        {
            mul = mul * a;
            a = a - 1;
        }
        System.out.println("The factorial of "+a+ " is "+mul);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you would like ti find the factor");
        factorial(sc.nextInt());
    }
}
