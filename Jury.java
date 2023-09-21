import java.util.Scanner;

public class Jury extends Personne {
    private int nombreJuryParticipes;

    public Jury(String nom, String prenom, int tel, char genre) {
        super(nom, prenom, tel, genre);
        nombreJuryParticipes = 0;
    }

    public int getNombreJuryParticipes() {
        return nombreJuryParticipes;
    }

    public void incrementerNombreJuryParticipes() {
        nombreJuryParticipes++;
    }

    public static Jury addJury(Scanner scanner) {
        System.out.println("Nom du jury ?");
        String nom = scanner.next();
        System.out.println("Prénom du jury ?");
        String prenom = scanner.next();
        System.out.println("Numéro de téléphone du jury ?");
        int tel = scanner.nextInt();
        System.out.println("Genre du jury (M/F) ?");
        char genre = scanner.next().charAt(0);

        return new Jury(nom, prenom, tel, genre);
    }

    @Override
    public String toString() {
        return super.toString() + ", Jurys participés: " + nombreJuryParticipes;
    }
}
