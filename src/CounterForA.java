import java.util.Scanner;

public class CounterForA {
    //enter any String and count total number of 'a' in that String.
    static void findTotalCount(String s){
        int counter=0;
        char ch='a';
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==ch){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findTotalCount(sc.nextLine());

    }
}
