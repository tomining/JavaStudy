package tomining.java.operation;

/**
 * Created by tomining on 2016. 9. 28..
 */
public class OrOperationExample {
    public static void main(String[] args) {
        if (alwaysFalse() | alwaysTrue()) {
            System.out.println("false | true case");
        }
        System.out.println();

        if (alwaysTrue() | alwaysFalse()) {
            System.out.println("true | false case");
        }
        System.out.println();

        if (alwaysFalse() || alwaysTrue()) {
            System.out.println("false || true case");
        }
        System.out.println();

        if (alwaysTrue() || alwaysFalse()) {
            System.out.println("true || false case");
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
