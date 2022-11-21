import java.util.*;

public class Toto implements Observer {
    public String nom;

    public Toto(String nom) {
        this.nom = nom;
    }

    public void update(Observable o, Object arg) {
        System.out.println("je suis " + this.nom + " La nouvelle valeur de n est " + ((Timer) o).getX());
    }

}
