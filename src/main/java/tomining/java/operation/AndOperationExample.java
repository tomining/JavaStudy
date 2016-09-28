package tomining.java.operation;

/**
 * Created by NAVER on 2016. 9. 28..
 */
public class AndOperationExample {
    public static void main(String[] args) {
        if ((alwaysFalse() & alwaysTrue()) == false) {
            System.out.println("false & true case");
        }
        System.out.println();

        if ((alwaysTrue() & alwaysFalse()) == false) {
            System.out.println("true & false case");
        }
        System.out.println();

        if ((alwaysFalse() && alwaysTrue()) == false) {
            System.out.println("false && true case");
        }
        System.out.println();

        if ((alwaysTrue() && alwaysFalse()) == false) {
            System.out.println("true && false case");
        }
        System.out.println();
    }

    public static boolean alwaysTrue() {
        System.out.println("Always True");
        return true;
    }

    public static boolean alwaysFalse() {
        System.out.println("Always False");
        return false;
    }
}
