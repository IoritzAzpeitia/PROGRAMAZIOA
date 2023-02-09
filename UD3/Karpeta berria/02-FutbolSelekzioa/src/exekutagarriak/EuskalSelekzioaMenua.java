package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import javax.print.event.PrintEvent;
import javax.swing.text.html.FormView;

import exekutagarriak.EuskalSelekzioa;
import model.IntegranteSeleccion;
import model.Futbolista;
import model.Demarkazioa;
import model.Entrenador;
import model.Masajista;

public class EuskalSelekzioaMenua {
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = 0;
        boolean aukeraEgokia = false;
        selekzioOsoaSortu();
        do {
            do {
                System.out.println("**************************************************************");
                System.out.println("*  EUSKAL SELEKZIOA");
                System.out.println("*  -------------------------------------------");
                System.out.println("*  1. Partaideen datuak ikusi");
                System.out.println("*  2. Partaideen datuak ikusi taldekatuta");
                System.out.println("*  3. Partaideak alfabetikoki inprimatu");
                System.out.println("*  4. Aldaketa");
                System.out.println("*  5. Bilatu abizenetik");
                System.out.println("*  6. Futbolariak alfabetikoki inprimatu");
                System.out.println("*  ");
                System.out.println("*  ");
                System.out.println("*                0 sakatu irteteko");
                System.out.print("Zure aukera : ");
                option = in.nextInt();

                if (option == 1 || option == 2 || option == 3 || option == 4 || option == 5 || option == 6
                        || option == 0) {
                    aukeraEgokia = true;
                }
            } while (!aukeraEgokia);

            switch (option) {
                case 1:
                    partaideakIkusi();
                    break;
                case 2:
                    partaideakTaldekatuta();
                    break;
                case 3:
                    partaideakAlfabetikoki();
                    break;
                case 4:
                    aldaketa();
                    break;
                case 5:
                    bilatuAbizenetik();
                    break;
                case 6:
                    futbolariakAlfabetikoki();
                    break;
            }
        } while (option != 0);
        System.out.println("Irteten...");

    }

    public static void selekzioOsoaSortu() {

        selekzioa.add(new Futbolista(1, "Aitor", 29, "Fernández", 1, Demarkazioa.POR));
        selekzioa.add(new Futbolista(2, "Unai", 28, "Bustinza", 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(3, "Mikel", 32, "Balenziaga", 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(4, "Asier", 30, "Illarramendi", 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(5, "Iñigo", 29, "Martínez", 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(6, "Mikel", 31, "San José", 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(7, "Gaizka", 23, "Larrazabal", 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(8, "Manu", 34, "García", 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(9, "Aritz", 39, "Aduriz", 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(10, "Javier", 30, "Eraso", 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(11, "Asier", 23, "Villalibre", 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(12, "Aihen", 23, "Muñoz", 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(13, "Iago", 32, "Herrerín", 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(14, "Aritz", 26, "Elustondo", 14, Demarkazioa.MED));
        selekzioa.add(new Futbolista(15, "Jesús", 21, "Areso", 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(16, "Iñigo", 23, "Vicente", 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(17, "Daniel", 21, "Vivian", 17, Demarkazioa.MED));

        selekzioa.add(new Entrenador(18, "Javier", 0, "Clemente", "F1"));
        selekzioa.add(new Entrenador(19, "Joseba", 0, "Núñez", "F2"));
        selekzioa.add(new Entrenador(20, "Markel", 0, "Lautadahandi", "F3"));

        selekzioa.add(new Masajista(21, "Iñaki", 0, "Sertxiberrieta", "Fisioterapeuta", 0));

        selekzioa.add(new IntegranteSeleccion(22, "Ander", 0, "Etxeburu"));

    }

    public static void partaideakIkusi() {
        for (int i = 0; i < selekzioa.size(); i++) {
            System.out.println(selekzioa.get(i));
        }
        System.out.printf("\n\n\n");
    }

    public static void partaideakTaldekatuta() {
        ArrayList<IntegranteSeleccion> entrenadores = new ArrayList<>();
        ArrayList<IntegranteSeleccion> masajistas = new ArrayList<>();
        ArrayList<IntegranteSeleccion> futbolistas = new ArrayList<>();
        ArrayList<IntegranteSeleccion> integrantes = new ArrayList<>();

        for (int i = 0; i < selekzioa.size(); i++) {

            if (selekzioa.get(i).getClass() == Entrenador.class) {
                entrenadores.add(selekzioa.get(i));
            }
            if (selekzioa.get(i).getClass() == Masajista.class) {
                masajistas.add(selekzioa.get(i));
            }
            if (selekzioa.get(i).getClass() == Futbolista.class) {
                futbolistas.add(selekzioa.get(i));
            }
            if (selekzioa.get(i).getClass() == IntegranteSeleccion.class) {
                integrantes.add(selekzioa.get(i));
            }
        }

        System.out.println("----------------------ENTRENATZAILEAK----------------------");

        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println(entrenadores.get(i));
        }
        System.out.println("Entrenatzaile kopurua: " + entrenadores.size());
        System.out.println();

        System.out.println("----------------------FUTBOLISTAK----------------------");

        for (int i = 0; i < futbolistas.size(); i++) {
            System.out.println(futbolistas.get(i));

        }
        System.out.println("----------------------MASAJISTAK----------------------");
        for (int i = 0; i < masajistas.size(); i++) {
            System.out.println(masajistas.get(i));
            System.out.println("Masajista kopurua: " + masajistas.size());
            System.out.println();

        }
        System.out.println("Futbolista kopurua: " + futbolistas.size());
        System.out.println();

        System.out.println("----------------------INTEGRANTEAK----------------------");

        for (int i = 0; i < integrantes.size(); i++) {
            System.out.println(integrantes.get(i));

        }
        System.out.println("Integrante kopurua: " + integrantes.size());
        System.out.println();
    }

    public static void partaideakAlfabetikoki() {

    }

    public static void aldaketa() {

    }

    public static void bilatuAbizenetik() {

    }

    public static void futbolariakAlfabetikoki() {

    }
}
