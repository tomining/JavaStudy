package tomining.exception;

/**
 * Created by NAVER on 2016. 10. 5..
 */
public class TryCatchFinallyTrick {
    public static void main(String[] args) {
        System.out.println("The output is: " + getName());
    }

    static int getName(){
        int a = 3;
        try{
            System.out.println("I am try");
            a=4;
            return a;
        } catch(Exception e){
            System.out.println("I am catch");
            a=5;
            return a;
        } finally {
            System.out.println("I am finally.");
            a = 6;
        }
    }
}
