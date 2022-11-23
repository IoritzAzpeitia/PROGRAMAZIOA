package random;

public class Prog2 {
    public static void main(String[] args) {
        String jendea [] = {"Bartolo Terias","Carvajal Avergas","Camilo VI","Valdemoro","Matamoros Fuertes","Periko Trokal"};

        int aukIzena = (int)(Math.random()*jendea.length);

        System.out.println("Jokalari aukeratua "+jendea[aukIzena]+" izango da");
        
    }
}
