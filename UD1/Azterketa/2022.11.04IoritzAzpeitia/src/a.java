import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        String[] abc;
        String letra;

        abc = new String[8];
        Scanner in = new Scanner(System.in);
        System.out.println("Idatzi 8 letra espazioz bananduta: ");

        for (int i = 0; i < abc.length; i++) {
            abc[i] = in.next();

        }
        System.out.println("Sakatu R(everse) izenak atzekoz aurrera ikusteko: ");
       
        letra = in.next().toUpperCase();

        if(letra.equals("L")){
            for (int i = 7, y = 1; i >= 0; i--, y++) {
                System.out.println(y + "- " + abc[i]);
            }

        }
        

    }
}