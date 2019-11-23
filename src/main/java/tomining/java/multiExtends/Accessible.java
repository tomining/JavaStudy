package tomining.java.multiExtends;

public interface Accessible {
    default void access() {
        System.out.println("access");
    }

    default void print() {
        System.out.println("Accessible");
    }
}
