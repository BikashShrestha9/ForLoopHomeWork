import java.util.Scanner;

public class Months {
    //print month names with 1-12 – other invalid entry by using switch.
    static void months(int k){
        String months = "";//initialise the months with empty value
        switch(k){
            case 1: months ="January";
                break;
            case 2: months="February";
                break;
            case 3: months="March";
                break;
            case 4: months="April";
                break;
            case 5: months="May";
                break;
            case 6: months="June";
                break;
            case 7: months="July";
                break;
            case 8: months="August";
                break;
            case 9: months="September";
                break;
            case 10: months="October";
                break;
            case 11: months="November";
                break;
            case 12: months="December";
                break;
            default:
                System.out.println("Please enter the valid number between 1 - 12");
        }
        System.out.println(months);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        months(sc.nextInt());
    }
}
