import java.util.*;
import java.text.SimpleDateFormat;

public class Calendrier {

    Date datedebut;
    static SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
    Date datefin;




    public static String formaterDate(Date date){
        return formater.format(date);
    }
    public static Date addDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mois du concours ?");
        int mois = sc.nextInt();
        if (mois < 1 || mois > 12) {
            System.out.println("Mois invalide");
            return null;
        }
        System.out.println("Jour du concours ?");
        int jour = sc.nextInt();
        if (jour < 1 || jour > 31) {
            System.out.println("Jour invalide");
            return null;
        }
        System.out.println("Date du concours : "+formater.format(new Date(2023, mois-1, jour)));
        return new Date(2023, mois-1, jour);
    }


    public String toString(){
        return "Date du concours : " + formater.format(datefin);
    }
}
