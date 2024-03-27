import java.util.Scanner;

public class TimesTable {
    //Print Multiplication Table for any Number
    static void multipleTable(int a){
        for(int i=1; i<=a; i++){
            for(int k=1; k<13; k++){
                System.out.println(i+" X "+ k +" = "+i*k);
            }
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       multipleTable(scanner.nextInt());
    }
}
