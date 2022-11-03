import java.util.Scanner;

public class HitzEzkutua {

    public static void main(String[] args) {
        String hitza = "udazkena";
        char letra;

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu karaktere bat?");
        letra = in.next().charAt(0); // para poner un char en vez de un int
        in.close();
        for (int index = 0; index < hitza.length(); index++) {
            char compara = hitza.charAt(index);
            if (compara == letra) {
                System.out.print(letra);
            } else {
                System.out.print("-");
            }
        }
    }
}