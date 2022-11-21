import java.util.Scanner;

public class Laukia {

    private int zabalera = 5;
    private int altuera = 5;

    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zabalera, int altuera) {
        this.zabalera = zabalera;
        this.altuera = altuera;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        return altuera * zabalera;
    }

    public int getPerimetroa() {
        return altuera * 2 + zabalera * 2;
    }

    public String getMota() {
        String emaitza = "";

        if (this.zabalera == this.altuera) {

            emaitza = "Karratua";

        } else if (this.zabalera > this.altuera) {

            emaitza = "Horizontala";

        } else {

            emaitza = "Bertikala";
        }
        return emaitza;
    }

    public void setZabalera(int zabaleraBerria) {

        zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {

        altuera = altueraBerria;
    }

    public String toString() {

        return "Laukia[" + zabalera + "X" + altuera + "]";
    }

    public void marraztuBeteta() {

        for (int row = 0; row < this.altuera; row++) {

            for (int colum = 0; colum < this.zabalera; colum++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void marraztuHutsik() {

        for (int row = 0; row < this.altuera; row++) {

            for (int colum = 0; colum < this.zabalera; colum++) {

                if ((row == 0) || (colum == 0) || (row == zabalera - 1) || (colum == altuera - 1)) {

                    System.out.print(" * ");

                } else {

                    System.out.print("   ");
                }

            }
            System.out.println();
        }

    }

    public void marraztuBeteta(char ikurra) {

        for (int row = 0; row < this.altuera; row++) {

            for (int colum = 0; colum < this.zabalera; colum++) {

                System.out.print(ikurra);
            }
            System.out.println();
        }
    }

    public String laukiBetea(){
        
        String laukia = "";

        for (int i = 0; i < altuera; i++) {

            for (int y = 0; y < zabalera; y++) {

                laukia += "\n";               
            }
            laukia += "\n";
        }

        return laukia;
    }

    public boolean isBiggerThan(Laukia l1) {

        boolean handiago = false;
        
        if (this.getAzalera() > l1.getAzalera()){
            handiago = true;
        }

        return handiago;
    }

    public static Laukia getTheBiggest(Laukia[] laukiak) {

        Laukia max = laukiak[0];

        for (int i = 0; i < laukiak.length && laukiak[i] != null; i++) {

            if (laukiak[i].isBiggerThan(max)) {
                max = laukiak[i];    
            }    
        }

        return max;
    }

}
