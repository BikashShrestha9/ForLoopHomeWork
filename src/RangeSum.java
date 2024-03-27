import java.util.Scanner;

public class RangeSum {
    //program that prints the sum of x ranging from 1 to 20.
    static void sumOfRange(int a, int b){
        int k=0;
        for(int i =a; i<=b; i++){
            if(a>=1 && b<=20){
                k=k+i;
            }
            else{
                System.out.println("your range is out off the limit");
                break;
            }
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sumOfRange(sc.nextInt(), sc.nextInt());
    }
}
