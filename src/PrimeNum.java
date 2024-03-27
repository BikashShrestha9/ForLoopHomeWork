import java.util.Scanner;

public class PrimeNum {
    //check whether input number is prime or not
    static void findPrimeNo(int a){
        int l=a/2;
        int n = 0;
        for (int i = 2; i <= l; i++) {
            if(a%i==0){//condition checking if user input divide by 1 to up to half of the value remain 0
                System.out.println(a+ " is not a prime number");
                n=1;
                //i=-1;
                break;
                }
        }
            if(n==0 || (a>=0 && a<2)){//if user input is not 0 and 1 as well as not met the above condition
                System.out.println(a+" is a prime number");
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findPrimeNo(scanner.nextInt());

    }
}
