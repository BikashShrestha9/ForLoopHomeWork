public class DivisibleBy3and5 {
    //print the numbers between 1 to 100 which can be divided by 3 and 5 separately
    static void findDivisibleNum(){

        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Numbers between 1 to 100 that cab be divided by 3 and 5 separately ");
        findDivisibleNum();
    }
}
