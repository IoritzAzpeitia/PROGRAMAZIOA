import java.util.Scanner;

public class GeometriaAzterketa {
    private static double nota = 0;

    public static void main(String[] args) {

        System.out.println("GEOMETRIA AZTERKETA");
        System.out.println(" ");
        System.out.println(" ");

        if (galdera1()){
            System.out.println("Ondo erantzun duzu.");
            nota = nota + 2.5;
            System.out.println(nota);

        } else{
            System.out.println("Ez duzu ondo erantzun.");
            System.out.println(nota);
        };

        if(galdera2()){
            System.out.println("Ondo erantzun duzu");
            nota=nota+2.5;
            System.out.println(nota);
        } else {
            System.out.println("Ez duzu ondo erantzun");
            System.out.println(nota);
        }
        
        if(galdera3()){
            System.out.println("Ondo erantzun duzu");
            nota=nota+2.5;
            System.out.println(nota);
        } else {
            System.out.println("Ez duzu ondo erantzun");
            System.out.println(nota);
        }

        if(galdera4()){
            System.out.println("Ondo erantzun duzu");
            nota=nota+2.5;
            System.out.println(nota);
        } else {
            System.out.println("Ez duzu ondo erantzun");
            System.out.println(nota);
        }


  

        

    }

    public static boolean galdera1(){
        System.out.println("Zein da p1(1,5) eta p2(7,3) puntuen arteko distantzia? ");
        Scanner sc = new Scanner(System.in);
        int erantzuna = sc.nextInt();
        int emaitza = 8;
        return emaitza == erantzuna;
    }

    public static boolean galdera2(){
        System.out.println("Zein da 3cm eta 5cm katetoen tirangulu baten hipotenusa? ");
        Scanner sc = new Scanner(System.in);
        double erantzuna = sc.nextDouble();
        double emaitza = 5.83;
        return emaitza == erantzuna;
    }

    public static boolean galdera3(){
        System.out.println("Zein da 5cm-ko aldeak dituen karratu baten perimetroa? ");
        Scanner sc = new Scanner(System.in);
        int erantzuna = sc.nextInt();
        int emaitza = 20;
        return emaitza == erantzuna;
    }

    public static boolean galdera4(){
        System.out.println("Zein da 7cm-ko radioa duen zirkuferentzi baten diametroa? ");
        Scanner sc = new Scanner(System.in);
        int erantzuna = sc.nextInt();
        int emaitza = 14;
        return emaitza == erantzuna;
    }
}

