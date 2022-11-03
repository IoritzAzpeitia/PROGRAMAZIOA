
import java.util.Scanner;

public class Gurutzea {

    public static void main(String[] args) {

        int num;

        Scanner in = new Scanner(System.in);
        System.out.print("Zein da inprimatu nahi duzun azken zenbakia? ");
        num = in.nextInt();

        in.close();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                if( num/2==i || num/2==j  || (num%2==0 && num/2==i+1) || (num%2==0 && num/2==j+1)) {
                    System.out.print("0 ");
                }
                    else{
                        System.out.print(". ");

                    }
                 

            }
            System.out.println();
        }
    }
}
