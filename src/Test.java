public class Test {
    public static void main(String[] args) {
        Timer te = new Timer();
        Toto to1 = new Toto("Observer 1");
        Toto to2 = new Toto("Observer 2");

        System.out.println("La valeur initiale est " + te.getX());
        te.addObserver(to1);
        te.addObserver(to2);
        te.setX(10);
    }

}
