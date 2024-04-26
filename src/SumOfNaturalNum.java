import java.util.Scanner;

public class SumOfNaturalNum {
    //Display Sum of n Natural Number
    static void sumofNum(int a){
        /*int n=0;
        for(int i =0; i <=a; i++){
            n=n+i;
        }
        System.out.println(n);
        */
        int k=0;
        int i =a+1;
        k=a*i/2;
        System.out.println(k);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you would like ti find the sum");
        sumofNum(sc.nextInt());
    }
}
