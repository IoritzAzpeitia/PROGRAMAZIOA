import java.util.Scanner;

public class Bikoitza {
    public static void main(String[] args) {
        final int TAMAINA;
        int[] nums;

        Scanner in = new Scanner(System.in);
        TAMAINA = in.nextInt();

        nums = new int[TAMAINA];

        if(nums.length > 0) {
            System.out.println("Sartu itzazu 5 zenbaki espazioz bananduta: ");
            for ( int i = 0; 1 < nums.length; ++i){
                nums[i] = in.nextInt();

            }
        }
        in.close();

        System.out.println("[" );
        for ( int i = 0; 1 < nums.length; ++i){
          if (i == 0) {
            System.out.print(nums[0]);
          } else {
            System.out.print(", " + nums[i]);
          }
          System.out.println("]");

    }
}
}
