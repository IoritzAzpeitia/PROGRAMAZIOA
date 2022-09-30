public class RectangleComputation { 
   public static void main(String[] args) {

      double length, width, area, perimeter;
      length = 5;
      width = 3;
      area = length * width;
      perimeter = 2 * length + 2 * width;
      
      System.out.print("The length is ");  // Print description
      System.out.println(length);          // Print the value stored in the variable
      System.out.print("The width is ");
      System.out.println(width);
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }
}