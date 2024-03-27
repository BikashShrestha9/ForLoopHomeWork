import java.util.Scanner;

public class Reverse {
    //Reverse a number using for Loop
    static void reverseNumber(int k){
        String s=Integer.toString(k);
        String st="";
        for(int i= s.length()-1; i>=0; i--){
            st=st+s.charAt(i);
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseNumber(sc.nextInt());
    }
}
