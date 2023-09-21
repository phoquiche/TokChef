import java.util.ArrayList;
import java.util.List;

public class Personne {
    private static int idCounter = 0;
    private int id;
    private String nom;
    private String prenom;
    private int tel;
    private char genre;

    public Personne(String nom, String prenom, int tel, char genre) {
        this.id = ++idCounter;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTel() {
        return tel;
    }

    public char getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Téléphone: " + tel + ", Genre: " + genre;
    }
}
