package exekutagarriak;

import java.util.ArrayList;

import model.IntegranteSeleccion;
import model.Futbolista;
import model.Demarkazioa;
import model.Entrenador;
import model.Masajista;


public class EuskalSelekzioa {

    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

    /**
     * Programa honek metodo desberdinei deituko die banan banan.
     * Beharbada ez diozu koherentzia handirik topatuko programa osoari.
     * Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen
     * trebatzea.
     * 
     */
    public static void main(String[] args) {

        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        selekzioaImprimatu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du:
     * "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11,
     * demarcacion=DEL}"
     * Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     * Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki
     * dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat)
     * erabili dezakezu
     * partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat() {
        Futbolista futbolari = new Futbolista( azkenId++, " Asier",23, " Villalibre", 11, Demarkazioa.DEL);
        System.out.println(futbolari);
        futbolari.entrenar();
    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta
     * bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu() {
        Entrenador f1 = new Entrenador( azkenId++, "Javier",73, "Clemente", "108E");
        System.out.println(f1);
        Masajista f2 = new Masajista( azkenId++, "Iñaki",23, "Sertxiberrieta", "GradoMediodeFP", 34);
        System.out.println(f2);
        IntegranteSeleccion f3 = new IntegranteSeleccion( azkenId++, " Ander",23, " Etxeburu");
        System.out.println(f3);
    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko
     * ArrayList estatiko baten.
     * 
     */
    public static void selekzioOsoaSortu() {

        selekzioa.add(new Futbolista(1, "Aitor", 29, "Fernández", 1, Demarkazioa.POR));
        selekzioa.add(new Futbolista(2, "Unai",28 ,"Bustinza" , 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(3, "Mikel",32 , "Balenziaga", 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(4, "Asier", 30, "Illarramendi", 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(5, "Iñigo", 29,"Martínez" , 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(6, "Mikel", 31, "San José", 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(7, "Gaizka", 23, "Larrazabal", 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(8, "Manu", 34, "García", 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(9, "Aritz",39 , "Aduriz", 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(10, "Javier",30 ,"Eraso" , 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(11, "Asier",23 ,"Villalibre" , 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(12, "Aihen", 23, "Muñoz", 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(13, "Iago",32 ,"Herrerín" , 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(14, "Aritz",26 , "Elustondo", 14, Demarkazioa.MED));
        selekzioa.add(new Futbolista(15, "Jesús",21 , "Areso", 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(16, "Iñigo", 23, "Vicente", 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(17, "Daniel",21 , "Vivian", 17, Demarkazioa.MED));

        selekzioa.add(new Entrenador(18, "Javier",0 , "Clemente", "F1"));
        selekzioa.add(new Entrenador(19, "Joseba",0 ,"Núñez" , "F2"));
        selekzioa.add(new Entrenador(20, "Markel", 0,"Lautadahandi" , "F3"));

        selekzioa.add(new Masajista(21, "Iñaki",0 , "Sertxiberrieta", "Fisioterapeuta", 0));

        selekzioa.add(new IntegranteSeleccion(22, "Ander", 0,"Etxeburu" ));  


    }
    public static void selekzioaImprimatu(){
        for (int i = 0; i < selekzioa.size(); i++) {
            System.out.println(selekzioa.get(i));
        }
     //System.out.println(selekzioa);   DENA JUNTU ArrayList-a imprimatu
    }

    /**
     * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return
     */
    public static boolean partaideaEzabatu(int id) {


        return false;
    }
}