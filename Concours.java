import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Concours {
    static Chef[] chefs = new Chef[5];
    static Jury[] jurys = new Jury[3];

    public static void jeu(){
        System.out.println("Concours du meilleur chef\n Date du concours: "+ Calendrier.formaterDate(Main.listeDates.get(0)));
        //on affiche la liste des chefs

        for(int i=0; i<5; i++){
            chefs[i] = Main.listeChefs.get(i);
            System.out.print("Chef numéro "+ i +" "+ chefs[i].toString());
        }
        for(int i=0; i<3; i++){
            jurys[i] = Main.listeJury.get(i);
            System.out.print("Jury numéro "+ i +" "+ jurys[i].toString());
        }

        //on affiche la liste des jurys
        System.out.println("Liste des chefs :");
        for (Chef chef : chefs) {
            System.out.println(chef.toString());
        }
        System.out.println("Liste des jurys :");
        for (Jury jury : jurys) {
            System.out.println(jury.toString());
        }
        //chaque chef prépare un plat au hasard de la liste des plats
        //chaque jury note chaque plat

        //on affiche les notes de chaque jury pour chaque plat
        //on affiche le gagnant
        ArrayList<String> ListePlat = preparePlat();
        try {
            notePlat(ListePlat);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static ArrayList<String> preparePlat(){

        ArrayList<String> platPresent = new ArrayList<>();
        for (int i = 0; i < Main.listeChefs.size(); i++) {

            float rand = (float) Math.random();
            if (rand < 0.7) {
                System.out.println("Le plat est la spécialité du chef");
                Chef chef = new Chef("nom", "prenom", 123456789, 'M', 1);
                Plat Plat = Main.listePlats.get(chef.getSpecialite());
                platPresent.add(Plat.toString()+"\n Préparé par Chef "+chefs[i].getNom());
            } else {
                System.out.println("Le plat est un plat aléatoire");
                int rand2 = (int) (Math.random() * (Main.listePlats.size() - 1));
                Plat Plat = Main.listePlats.get(rand2);
                platPresent.add(Plat.toString()+"\n Préparé par Chef "+chefs[i].getNom());
            }
        }
        return platPresent;
    }

    public static void notePlat(ArrayList<String> platPresent) throws InterruptedException {
        ArrayList<String> platNote = new ArrayList<>();
        for(int i=0; i<5; i++){
            System.out.print("Chef "+chefs[i].getNom()+" présente "+platPresent.get(i));
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            //générer un int aléatoire entre 0 et 20
            int randjury1 = (int) (Math.random() * 20);
            System.out.println("Note du jury "+jurys[0].getNom()+" : "+randjury1);
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            int randjury2 = (int) (Math.random() * 20);
            System.out.println("Note du jury "+jurys[1].getNom()+" : "+randjury2);
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            int randjury3 = (int) (Math.random() * 20);
            System.out.println("Note du jury "+jurys[2].getNom()+" : "+randjury3);
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            sleep(500);
            System.out.println("...");
            int moyenne = (randjury1+randjury2+randjury3)/3;
            System.out.println("Moyenne pour Chef: "+chefs[i].getNom()+" "+moyenne);
            platNote.add(moyenne+"-"+chefs[i].getNom());



        }
        //récupérer la note et le nom du chef puis ajouter une étoile a celui qui a la meilleur note
        int max = 0;
        String nomchef = "";
        for(int i=0; i<5; i++){
            String[] parts = platNote.get(i).split("-");
            int note = Integer.parseInt(parts[0]);
            if(note>max){
                max = note;
                nomchef = parts[1];
            }
        }
        for(int i=0; i<5; i++){
            if(chefs[i].getNom().equals(nomchef)){
                chefs[i].incrementerEtoiles();
            }
        }

    }
}
