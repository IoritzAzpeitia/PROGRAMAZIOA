import java.util.Scanner;

public class Menua {
    private static int LAUKI_KOP = 10;
    private static int sortutakoak = 0;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        int aukera = 0;

        while (aukera != 5) {

            System.out.println("LAUKIAK");
            System.out.println("=========================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- Irten");
            System.out.println("Aukeratu zenbaki bat:");
            aukera = in.nextInt();

            switch (aukera){

                case 1:
                    sortu();
                    break;

                case 2:
                    imprimatu();
                    break;
                case 3:
                    marraztu();
                    break;
                case 4:
                    handiena();
                    break;
                case 5:

                    System.out.println("Programa hau ixtera doa.");
                    break;
            }
        }
        in.close();
    }
    public static void imprimatu(){
        System.out.printf("Laukia\tZabalera\tAltuera\tAzalera\tPermietroa\t\tMota\n");
        System.out.printf("==============================================================================\n");

        for (int i = 0; i < sortutakoak; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%s\n", (i + 1), laukiak[i].getZabalera(), laukiak[i].getAltuera(), laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
        }        
    }
    
    public static void marraztu() {

        String betetaHutsik;
        int posizioa;

        System.out.println("Zenbatgarren laukia nahi duzu marraztea?");
        posizioa = (in.nextInt() - 1);

        System.out.println("Beteta ala hutsik marraztu nahi duzu (B/H)? ");
        betetaHutsik = in.next();

        if (betetaHutsik.equals("B")) {
            
            laukiak[posizioa].marraztuBeteta(laukiak[posizioa]);
            
        } else {

            laukiak[posizioa].marraztuHutsik(laukiak[posizioa]);
    
        }

    }
    
    public static void handiena(){

        Laukia handiena = new Laukia();

        handiena = Laukia.getTheBiggest(laukiak);

        System.out.println("Laukirik handiena hau da: " + handiena.toString());
    }
}
