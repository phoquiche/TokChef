import java.util.Scanner;
public class Plat {
    private static int idCounter = 0;
    private int id;
    private String nom;
    private Ingredients[] ingredients;
    private int[] quantite;
    private String[] consigne;
    private int nbIngredients;

    public Plat(String nom, Ingredients[] ingredients, int[] quantite, String[] consigne, int nbIngredients){
        this.id = ++idCounter;
        this.nom = nom;
        this.ingredients = ingredients;
        this.quantite = quantite;
        this.consigne = consigne;
        this.nbIngredients = nbIngredients;
    }
    public int getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }
    public Ingredients[] getIngredients(){
        return ingredients;
    }
    public int[] getQuantite(){
        return quantite;
    }
    public String[] getConsigne(){
        return consigne;
    }
    public int getNbIngredients(){
        return nbIngredients;
    }
    public String setNom(String nom){
        return this.nom = nom;
    }
    public Ingredients[] setIngredients(Ingredients[] ingredients){
        return this.ingredients = ingredients;
    }
    public int[] setQuantite(int[] quantite){
        return this.quantite = quantite;
    }
    public String[] setConsigne(String[] consigne){
        return this.consigne = consigne;
    }
    public int setNbIngredients(int nbIngredients){
        return this.nbIngredients = nbIngredients;
    }
    public static Plat addPlat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom du plat ?");
        String nom = sc.nextLine();
        System.out.println("Nombre d'ingrédients ?");
        int nbIngredients = sc.nextInt();
        Ingredients[] ingredients = new Ingredients[nbIngredients];
        int[] quantite = new int[nbIngredients];
        String[] consigne = new String[nbIngredients];
        for(int i = 0; i < nbIngredients; i++){
            System.out.println("type de l'ingrédient (Viande,Epice,Legume,Autre?");
            String type = sc.next();
            switch(type){
                case "Viande":
                    Viande viande = Viande.addViande();
                    Main.listeViandes.add(viande);
                    ingredients[i] = viande;
                    break;
                case "Epice":
                    Epice epice = Epice.addEpice();
                    Main.listeEpices.add(epice);
                    ingredients[i] = epice;

                    break;
                case "Legume":
                    Legume legume = Legume.addLegume();
                    Main.listeLegumes.add(legume);
                    ingredients[i] = legume;
                    break;
                case "Autre":
                    Autre autre = Autre.addAutre();
                    Main.listeAutres.add(autre);
                    ingredients[i] = autre;
                    break;
                default:
                    System.out.println("Erreur");
                    break;
            }



            System.out.println("Quantité ?");
            quantite[i] = sc.nextInt();
            System.out.println("Consigne ?");
            consigne[i] = sc.next();
        }
        return new Plat(nom, ingredients, quantite, consigne, nbIngredients);
    }
    public String toString(){
        String str = "ID: "+ id+ ", Nom: " + nom + ", Ingrédients: (";
        for(int i = 0; i < nbIngredients; i++){
            str += ingredients[i].toString() + ", Quantité: " + quantite[i] + "g, Consigne: " + consigne[i]+") ";
        }
        return str;
    }
}
