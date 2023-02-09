package exekutagarriak;

import java.util.ArrayList;
import model.IntegranteSeleccion;
import model.Futbolista;
import model.Demarkazioa;
import model.Entrenador;
import model.Masajista;

public class PartidakKudeatu {
    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList();
    private static Partida[] partidak = new Partida[200];

    /**
     * Programa honek selekzioa eta hasierako partiden datuak kargatu ondoren
     * erabiltzaileari datu
     * gehiago dauzkan galdetuko dio.
     * Jarraian partiden zerrenda bistaratuko da eta amaitzeko partiden inguruko
     * estadistikak bistaratuko ditu.
     */
    public static void main(String[] args) {

    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
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

    /**
     * Wikipediako orrian agertzen diren lehen partiden datuak txertatu partiden
     * arrayean.
     */
    public static int hasierakoPartidakErregistratu() {

        return 0;
    }

    /**
     * Partida berri baten datuak erabiltzaileari eskatu eta partida objektua
     * bueltatu.
     */
    public static Partida partidaBatenDatuakEskatu() {

        return null;
    }

    /** Partiden zerrenda bistaratu. */
    public static void partidakBistaratu() {

    }

    /**
     * Metodo honek hainbat estatistika kalkulatu eta kontsolatik inprimatuko ditu.
     * Adibidez:
     * 
     * - Jokatutako partida kopurua
     * - Zein izan den partidarik gogorrena txartel kopuruari dagokionez
     * - Txartel kopurua jokalariko
     * - Txartel gehien lortu duen jokalariaren izena
     * - Zenbat partida jolastu den urteko
     * - Duela zenbat urte jolastu zen lehen partida
     * - Partiden zein portzentai jokatu den abenduan
     * - ...
     */
    public static void estatistikak() {
    }

}
