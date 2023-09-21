
import java.util.*;

public class Main {
   static ArrayList<Chef> listeChefs = new ArrayList<>();
   static ArrayList<Jury> listeJury = new ArrayList<>();
    static ArrayList<Padawan> listePadawans = new ArrayList<>();
    static ArrayList<Viande> listeViandes = new ArrayList<>();
    static ArrayList<Epice> listeEpices = new ArrayList<>();
    static ArrayList<Legume> listeLegumes = new ArrayList<>();
    static  ArrayList<Autre> listeAutres = new ArrayList<>();
    static ArrayList<Plat> listePlats = new ArrayList<>();
    static ArrayList<Date> listeDates = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            if (listePlats.size() < 1) {
                System.out.println("Merci de commencer par ajouter des Plats (/addplat)");
            }
            else {
                System.out.println("Quelle commande ?");}
            String commande = scanner.next();
            if (commande.equals("/addchef")) {
                Chef chef = Chef.addChef(scanner);
                if (chef == null){
                    System.out.println("Pas assez de plats pour ajouter un chef");
                    continue;
                }
                else {
                    listeChefs.add(chef);
                    System.out.println("Chef ajouté : " + chef.toString());
                }
            } else if (commande.equals("/addjury")) {
                Jury jury = Jury.addJury(scanner);
                listeJury.add(jury);
                System.out.println("Jury ajouté : " + jury.toString());
            } else if (commande.equals("/addpadawan")) {
                Padawan padawan = Padawan.addPadawan(scanner);
                listePadawans.add(padawan);
                System.out.println("Padawan ajouté : " + padawan.toString());
            }
            else if (commande.equals("/addviande")){
                Viande viande = Viande.addViande();
                listeViandes.add(viande);
                System.out.println("Viande ajoutée : " + viande.toString());
            }
            else if(commande.equals("/addepice")){
                Epice epice = Epice.addEpice();
                listeEpices.add(epice);
                System.out.println("Epice ajoutée : " + epice.toString());
            }
            else if(commande.equals("/addlegume")){
                Legume legume = Legume.addLegume();
                listeLegumes.add(legume);
                System.out.println("Légume ajouté : " + legume.toString());
            }
            else if(commande.equals("/addautre")){
                Autre autre = Autre.addAutre();
                listeAutres.add(autre);
                System.out.println("Autre ajouté : " + autre.toString());
            }
            else if (commande.equals("/addplat")){


                    Plat plat = Plat.addPlat();
                    listePlats.add(plat);
                    System.out.println("Plat ajouté : " + plat.toString());

            }
            else if (commande.equals("/addconcours")) {
                Date date = Calendrier.addDate();
                listeDates.add(date);
            }
            else if (commande.equals("/listechefs")) {
                System.out.println("Liste des chefs :");
                for (Chef chef : listeChefs) {
                    System.out.println(chef.toString());
                }
            } else if (commande.equals("/listejury")) {
                System.out.println("Liste des jurys :");
                for (Jury jury : listeJury) {
                    System.out.println(jury.toString());
                }
            } else if (commande.equals("/listepadawans")) {
                System.out.println("Liste des padawans :");
                for (Padawan padawan : listePadawans) {
                    System.out.println(padawan.toString());
                }
            } else if (commande.equals("/listeviandes")) {
                System.out.println("Liste des viandes :");
                for (Viande viande : listeViandes) {
                    System.out.println(viande.toString());
                }
            } else if (commande.equals("/listeeepices")) {
                System.out.println("Liste des épices :");
                for (Epice epice : listeEpices) {
                    System.out.println(epice.toString());
                }
            } else if (commande.equals("/listelegumes")) {
                System.out.println("Liste des légumes :");
                for (Legume legume : listeLegumes) {
                    System.out.println(legume.toString());
                }
            } else if (commande.equals("/listeautres")) {
                System.out.println("Liste des autres :");
                for (Autre autre : listeAutres) {
                    System.out.println(autre.toString());
                }
            } else if (commande.equals("/listeplats")) {
                System.out.println("Liste des plats :");
                for (Plat plat : listePlats) {
                    System.out.println(plat.toString());
                }
            } else if (commande.equals("/help")) {
                System.out.println("Liste des commandes :");
                System.out.println("/addchef : ajouter un chef");
                System.out.println("/addjury : ajouter un jury");
                System.out.println("/addpadawan : ajouter un padawan");
                System.out.println("/addviande : ajouter une viande");
                System.out.println("/addepice : ajouter une épice");
                System.out.println("/addlegume : ajouter un légume");
                System.out.println("/addautre : ajouter un autre");
                System.out.println("/addplat : ajouter un plat");
                System.out.println("/listechefs : lister les chefs");
                System.out.println("/listejury : lister les jurys");
                System.out.println("/listepadawans : lister les padawans");
                System.out.println("/listeviandes : lister les viandes");
                System.out.println("/listeeepices : lister les épices");
                System.out.println("/listelegumes : lister les légumes");
                System.out.println("/listeautres : lister les autres");
                System.out.println("/listeplats : lister les plats");
                System.out.println("/help : afficher la liste des commandes");
                System.out.println("/advance : avancer au tour suivant");
                System.out.println("/exit : quitter le programme");

            }  else if (commande.equals("/advance")) {
                if(listePlats.size() < 2){
                    System.out.println("Pas assez de plats pour avancer");
                    continue;
                }
                else if(listeChefs.size()<5){
                    System.out.println("Pas assez de chefs pour avancer");
                    continue;
                }
                else if(listeJury.size()<3){
                    System.out.println("Pas assez de jury pour avancer");
                    continue;
                }
                else if(listePadawans.size()<5){
                    System.out.println("Pas assez de padawans pour avancer");
                    continue;
                }
                else{
                    System.out.println("Tournoi suivant");
                    Concours.jeu();
                }

            }
            else if (commande.equals("/exit")) {
                System.out.println("Fin du programme");
                break;

            }else {
                continue;
            }
        }
    }
}
