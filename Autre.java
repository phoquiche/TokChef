import java.util.Scanner;
public class Autre extends Ingredients{
    private char bio;
    private int kcal;

    public Autre(String nom, char bio, int kcal){
        super(nom);
        this.bio = bio;
        this.kcal = kcal;
    }
    public char getBio(){
        return bio;
    }
    public int getKcal(){
        return kcal;
    }
    public char setBio(char bio){
        return this.bio = bio;
    }
    public int setKcal(int kcal){
        return this.kcal = kcal;
    }
    public static Autre addAutre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom de l'ingrédient ?");
        String nom = sc.nextLine();
        System.out.println("Bio ? (O/N)");
        char bio = sc.next().charAt(0);
        System.out.println("Kcal ?");
        int kcal = sc.nextInt();
        return new Autre(nom, bio, kcal);
    }
    public String toString(){
        return super.toString() + ", Bio: " + bio + ", Kcal: " + kcal;
    }
}
