package ocp.webergeo.de;

public class Pengium implements Swim, Dance {
    public static void main(String[] args) {

        Data data =Data.INTERNAl;
        System.out.println(data.number);

        //new Pengium().doShow();
    }

    public void perform() {
        System.out.println("Pengium");
    }

    private void doShow() {
        Swim.super.perform();
    }

}
