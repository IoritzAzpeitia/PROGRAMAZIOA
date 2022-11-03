import java.util.Scanner;

public class Segida{
    public static void main(String[] args) {
        int num1, num2;
     

        Scanner in = new Scanner(System.in);
        System.out.print("Zein da inprimatu nahi duzun azken zenbakia? ");
        num1 = in.nextInt();
        System.out.print("Zenbat zenbakiko multzoak nahi dituzu? ");
        num2 = in.nextInt();

        for(int i = 1; i <= num1; ++i){
            System.out.println(i);
            if( i % num2 == 0){
               System.out.println("====="); 
            }
        }
        System.out.println("=====");


    }
}