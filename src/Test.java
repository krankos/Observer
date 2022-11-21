public class Test {
    public static void main(String[] args) {
        Timer te = new Timer();
        Toto to = new Toto("Observer 1");

        System.out.println("La valeur initiale est " + te.getX());
        te.addObserver(to);
        te.setX(5);
    }

}
