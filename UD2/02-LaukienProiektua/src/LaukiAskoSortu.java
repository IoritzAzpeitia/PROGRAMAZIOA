import java.util.Scanner;

public class LaukiAskoSortu {
    public static void main(String[] args) {
        
        int laukiKopuru;
        Laukia[]laukiak;
        int altuera;
        int zabalera;

        Scanner in = new Scanner(System.in);

        System.out.println("Zenbat lauki sortu nahi dituzu?");
        laukiKopuru= in.nextInt();

        laukiak = new Laukia[laukiKopuru];

        for (int i = 0; i < laukiak.length; i++) {
            System.out.println(i+1+". Laukiaren datuak: ");
            System.out.print("Zabalera: ");
            zabalera=in.nextInt();
            System.out.print("Altuera: ");
            altuera=in.nextInt();
            laukiak[i] = new Laukia(zabalera,altuera); 

        }
        System.out.println("Laukia\tZabalera\t Altuera\t Azalera\t Perimetroa\t Mota\n\n================================================================================\n");
        for (int y = 0; y < laukiKopuru; y++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%s\t%s\n\n", (y + 1), laukiak[y].getZabalera(),laukiak[y].getAltuera(), laukiak[y].getAzalera(), laukiak[y].getPerimetroa(), laukiak[y].getMota());
        }
        in.close();


    }
    
}
