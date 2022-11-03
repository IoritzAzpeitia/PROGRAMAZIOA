import java.util.Scanner;
import java.util.Arrays;

public class Bikoitza {
    public static void main(String[] args) {

        final int TAMAINA = 5;
        int[] numbers = new int[TAMAINA];

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu " + TAMAINA + " zenbaki: ");

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(numbers));
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = numbers[index] * 2;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
