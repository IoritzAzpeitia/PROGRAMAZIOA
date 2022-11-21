import java.util.Scanner;

public class Izartxoak {

    public static void main(String[] args) {

        int num;

        Scanner in = new Scanner(System.in);
        System.out.println("Esan zenbaki bat (1-10): ");
        num = in.nextInt();
        in.close();

        for (int i = 1; i <= 49; i++) {

            if (i % num == 0) {
                System.out.print(" * -");
            } else {
                System.out.print(i + " - ");
            }

        }
        if (50 % num == 0) {
            System.out.print(" * ");
        } else {
            System.out.print(50);
        }

    }
}
