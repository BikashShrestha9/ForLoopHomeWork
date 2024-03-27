import java.util.Scanner;

public class Calculator {
    //Making Calculator using the switch statement (The program takes three inputs
    //from the user: one operator and 2 numbers. Based on the operator provided by the user, it performs the calculation on the numbers.
    static void cal(int a, int b){
        Scanner scanner = new Scanner(System.in); //instantiated scanner class
        System.out.println("Please choose an operator: +, -, * or / ");
        char operator=scanner.next().charAt(0);//storing user input parameter in local variable
        int  k=0;

        switch (operator){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            default:
                System.out.println("not valid");
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        cal(sc.nextInt(), sc.nextInt());

    }
}
