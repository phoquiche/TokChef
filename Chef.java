    import java.util.Scanner;
import java.lang.*;

public class Chef extends Personne {
    private int specialite;
    private int etoiles;

    public Chef(String nom, String prenom, int tel, char genre, int specialite) {
        super(nom, prenom, tel, genre);
        this.specialite = specialite;
        this.etoiles = 0;
    }

    public int getSpecialite() {
        return specialite;
    }

    public int getEtoiles() {
        return etoiles;
    }

    public void incrementerEtoiles() {
        etoiles++;
    }

    public static Chef addChef(Scanner scanner) {
        System.out.println("Nom du chef ?");
        String nom = scanner.next();
        System.out.println("Prénom du chef ?");
        String prenom = scanner.next();
        System.out.println("Numéro de téléphone du chef ?");
        int tel = scanner.nextInt();
        System.out.println("Genre du chef (M/F) ?");
        char genre = scanner.next().charAt(0);
        System.out.println("Spécialité du chef ?");
        int specialite;
        if (Main.listePlats.size()<2){
            return null;
        }
        else {
            for (int i = 0; i < Main.listePlats.size(); i++) {
                System.out.println(i + " - " +Main.listePlats.get(i).getNom());
            }
            specialite = scanner.nextInt();
        }
        return new Chef(nom, prenom, tel, genre, specialite);
    }

    @Override
    public String toString() {
        Plat Plat = Main.listePlats.get(specialite);
        int idplat = Plat.getId();
        String nomplat = Main.listePlats.get(idplat-1).getNom();
        return super.toString() + ", Spécialité: " + nomplat + ", Étoiles: " + etoiles;
    }
}
