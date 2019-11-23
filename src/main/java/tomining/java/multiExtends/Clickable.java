package tomining.java.multiExtends;

public interface Clickable {
    default void click() {
        System.out.println("click");
    }

    default void print() {
        System.out.println("Clickable");
    }
}
