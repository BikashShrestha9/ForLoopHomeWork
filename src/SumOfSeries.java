import java.util.Scanner;

public class SumOfSeries {


    static void seriesSum(int n){
        //calculate the sum of following series where n is
        //input by user
         double x;
         double sum=0;
        for(x=1; x<=n; x++){
            sum=sum+1/x;
        }
        System.out.println(sum);
    }
    static void sumFromDhurv(int a){
        int b = a;
        double sum = 0;

        if(a > 0)
        {
            for(int i=1; i<=a; i++)
            {
                sum = sum + ((double) 1 /b);
                b = b - 1;
            }
            System.out.println("The sum of the series is : "+sum);
        }
        else {
            System.out.println("Entre the positive number");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number = ");
        //seriesSum(scanner.nextInt());
        //int Num = scanner.nextInt();
        sumFromDhurv(scanner.nextInt());



    }


}
