package tomining.exception;

/**
 * Created by NAVER on 2016. 10. 5..
 */
public class TryCatchFinallyTrick2 {
    public static void main(String[] args) {
        System.out.println("The output is: " + getName());
    }

    static String getName(){
        String  name = "a";
        try{
            System.out.println("I am try");
            name = "try";
            return name;
        } catch(Exception e){
            System.out.println("I am catch");
            name = "catch";
            return name;
        } finally {
            System.out.println("I am finally.");
            name = "finally";
            return name;
        }
    }
}
