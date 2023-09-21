public class Ingredients {
    private static int idCounter = 0;
    private int id;
    private String nom;

    public Ingredients(String nom) {
        this.id = ++idCounter;
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom;
    }

}
