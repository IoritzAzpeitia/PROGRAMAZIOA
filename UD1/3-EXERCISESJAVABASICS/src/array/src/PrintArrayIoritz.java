import java.util.Scanner;
/**
 * Prompt user for the length and all the elements of an array; and print [a1, a2, ..., an]
 */
public class PrintArrayIoritz {
   public static void main(String[] args) {
      // Declare variables
      final int NUM_ITEMS;
      int[] items;   // Declare array name, to be allocated after numItems is known

      Scanner in = new Scanner(System.in);
      // Prompt for a non-negative integer for the number of items;
      // and read the input as "int". No input validation.
      System.out.print("Enter the number of items: ");
      NUM_ITEMS = in.nextInt();

      // Allocate the array
      items = new int[NUM_ITEMS];

      // Prompt and read the items into the "int" array, only if array length > 0
      if (items.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for (int i = 0; i < items.length; ++i) {
            items[i] = in.nextInt();
         }
      }
      in.close();

      // Print array contents, need to handle first item and subsequent items differently
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