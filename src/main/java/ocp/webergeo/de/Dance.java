package ocp.webergeo.de;

public interface Dance {
    default void perform(){
        System.out.println("Dance");
    }
}
