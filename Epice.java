import java.util.Scanner;
public class Epice extends Ingredients{
    private char bio;

    public char getBio(){
        return bio;
    }
    public char setBio(char bio){
        return this.bio = bio;
    }
    public Epice(String nom, char bio){
        super(nom);
        this.bio = bio;
    }

    public static Epice addEpice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom de l'épice ?");
        String nom = sc.nextLine();
        System.out.println("Bio ? (O/N)");
        char bio = sc.next().charAt(0);
        return new Epice(nom, bio);
    }
    @Override
    public String toString(){
        return super.toString() + ", Bio: " + bio;
    }

}
