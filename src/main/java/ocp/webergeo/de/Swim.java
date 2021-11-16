package ocp.webergeo.de;

public interface Swim {
    default void perform() {
        System.out.println("Swim");
    }
}
