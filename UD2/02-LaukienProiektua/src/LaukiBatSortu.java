import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {
        int zabalera;
        int altuera;
        char ikurra;


        Scanner in = new Scanner(System.in);
        System.out.print("Sartu laukiaren zabalera: ");
        zabalera = in.nextInt();                         
        System.out.print("Sartu laukiaren altuera: ");
        altuera = in.nextInt();

        Laukia r1 = new Laukia(zabalera,altuera); 
        System.out.println("Lauki karratua sortu duzu: => "+ r1); 
        System.out.println("Hona marrazkia beteta: ");

        r1.marraztuBeteta();

        System.out.println("Hona marrazkia hutsik: ");

        r1.marraztuHutsik();

        System.out.print("Zein ikurrekin nahi duzu laukia bete? ");

        ikurra = (in.next().charAt(0));
        r1.marraztuBeteta(ikurra);
        in.close();

        

    }
}
