import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of items: ");
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];

        if(items.length > 0) {
        System.out.print("Enter the value of all items (separated by space): ");
            for ( int i = 0; 1 < items.length; ++i){
                items[i]  = in.nextInt();

            }
        }
        in.close();

        System.out.print("The values are: [");
        for (int i = 0; i < items.length; ++i) {
           if (i == 0) {
              // Print the first item without a leading commas
              System.out.print(items[0]);
           } else {
              // Print the subsequent items with a leading commas
              System.out.print(", " + items[i]);
           }
        }
        
        System.out.println("]");

        }
    }
    

