import java.util.Scanner;

public class Izenak {
    public static void main(String[] args) {

        String[] planetak;
        String letra;
        planetak = new String[8];

        Scanner in = new Scanner(System.in);
        System.out.println("Idatzi 8 izen: ");

        for (int i = 0; i < planetak.length; i++) {

            planetak[i] = in.next();

        }
        System.out.println("Sakatu R(everse) izenak atzekoz aurrera ikusteko: ");

        letra = in.next().toUpperCase();

        if(letra.equals("R")){
            for (int i = 7, y = 1; i >= 0; i--, y++) {
                System.out.println(y + "-" + planetak[i]);
            }

        }
    }
}