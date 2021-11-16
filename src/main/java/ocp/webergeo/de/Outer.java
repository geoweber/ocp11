package ocp.webergeo.de;

public class Outer {
    private static String greeting ="Hi!";
    class Inner{
        public int repeat =3;
        public void go(){
            for (int i = 0; i <repeat ; i++) {
                System.out.println(greeting);
            }
        }
    }

    public static void main(String[] args) {
        new Outer().new Inner().go();
    }
}
