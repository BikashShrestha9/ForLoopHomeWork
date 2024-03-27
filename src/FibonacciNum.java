import java.util.Scanner;

public class FibonacciNum {
    //Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.
    static void fibonacci(int a){
        int k=0;
        int l=1;
        for(int i =1; i<=a; i++){
            System.out.println(k);
            int z=k+l;
            k=l;
            l=z;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number you would like to print fibonacci sequence: ");
        fibonacci(scanner.nextInt());
    }
}
