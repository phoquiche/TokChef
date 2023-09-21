import java.util.Scanner;
public class Legume extends Ingredients{
    private int kcal;
    private int fiber;
    private char bio;

    public Legume(String nom, int kcal, int fiber, char bio){
        super(nom);
        this.kcal = kcal;
        this.fiber = fiber;
        this.bio = bio;
    }
    public int getKcal(){
        return kcal;
    }
    public int getFiber(){
        return fiber;
    }
    public char getBio(){
        return bio;
    }
    public int setKcal(int kcal){
        return this.kcal = kcal;
    }
    public int setFibre(int fiber){
        return this.fiber = fiber;
    }
    public char setBio(char bio){
        return this.bio = bio;
    }
    public static Legume addLegume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom du légume ?");
        String nom = sc.nextLine();
        System.out.println("Kcal ?");
        int kcal = sc.nextInt();
        System.out.println("Fibre ?");
        int vitamine = sc.nextInt();
        System.out.println("Bio ? (O/N)");
        char bio = sc.next().charAt(0);
        return new Legume(nom, kcal, vitamine, bio);
    }

    public String toString(){
        return super.toString() + ", Kcal: " + kcal + ", Taux de fibre: " + fiber + ", Bio: " + bio;
    }
}
