import java.util.Scanner;
public class Viande extends Ingredients{
    private int kcal;
    private int fat;
    private char bio;

    public Viande(String nom, int kcal, int fat, char bio){
        super(nom);
        this.kcal = kcal;
        this.fat = fat;
        this.bio = bio;
    }
    public int getKcal(){
        return kcal;
    }
    public int getFat(){
        return fat;
    }
    public char getBio(){
        return bio;
    }
    public int setKcal(int kcal){
        return this.kcal = kcal;
    }
    public int setFat(int fat){
        return this.fat = fat;
    }
    public char setBio(char bio){
        return this.bio = bio;
    }
    public static Viande addViande(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom de la viande ?");
        String nom = sc.nextLine();
        System.out.println("Kcal ?");
        int kcal = sc.nextInt();
        System.out.println("Fat ?");
        int fat = sc.nextInt();
        System.out.println("Bio ? (O/N)");
        char bio = sc.next().charAt(0);
        return new Viande(nom, kcal, fat, bio);
    }

    public String toString(){
        return super.toString() + ", Kcal: " + kcal + ", Taux de gras: " + fat + ", Bio: " + bio;
    }
}
