import java.util.Scanner;

public class Padawan extends Personne {
    private int age;
    private int idChef;

    public Padawan(String nom, String prenom, int tel, char genre, int age, int idChef) {
        super(nom, prenom, tel, genre);
        this.age = age;
        this.idChef = idChef;
    }

    public int getAge() {
        return age;
    }

    public int getIdChef() {
        return idChef;
    }

    public static Padawan addPadawan(Scanner scanner) {
        System.out.println("Nom du Padawan ?");
        String nom = scanner.next();
        System.out.println("Prénom du Padawan ?");
        String prenom = scanner.next();
        System.out.println("Numéro de téléphone du Padawan ?");
        int tel = scanner.nextInt();
        System.out.println("Genre du Padawan (M/F) ?");
        char genre = scanner.next().charAt(0);
        System.out.println("Âge du Padawan ?");
        int age = scanner.nextInt();
        System.out.println("ID du chef du Padawan ?");
        System.out.println("Liste des chefs :");
        for (int i = 0; i < Main.listeChefs.size(); i++) {
            System.out.println(i + " - " + Main.listeChefs.get(i).getNom());
        }
        int idChef = scanner.nextInt();

        return new Padawan(nom, prenom, tel, genre, age, idChef);
    }

    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age + ", Nom du Chef: Chef " + Main.listeChefs.get(idChef).getNom();
    }
}
