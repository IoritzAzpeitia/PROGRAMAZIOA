/**
 * A Test Driver for the "Circle" class
 */
public class TestCircle {    // Save as "TestCircle.java"
   public static void main(String[] args) {   // Program entry point
      // Declare and Construct an instance of the Circle class called c1
      Circle c1 = new Circle(2.0, "blue");  // Use 3rd constructor
      System.out.println("The radius is: " + c1.getRadius());  // use dot operator to invoke member methods
      //The radius is: 2.0
      System.out.println("The color is: " + c1.getColor());
      //The color is: blue
      System.out.printf("The area is: %.2f%n", c1.getArea());
      //The area is: 12.57

      // Declare and Construct another instance of the Circle class called c2
      Circle c2 = new Circle(2.0);  // Use 2nd constructor
      System.out.println("The radius is: " + c2.getRadius());
      //The radius is: 2.0
      System.out.println("The color is: " + c2.getColor());
      //The color is: red
      System.out.printf("The area is: %.2f%n", c2.getArea());
      //The area is: 12.57

      // Declare and Construct yet another instance of the Circle class called c3
      Circle c3 = new Circle();  // Use 1st constructor
      System.out.println("The radius is: " + c3.getRadius());
      //The radius is: 1.0
      System.out.println("The color is: " + c3.getColor());
      //The color is: red
      System.out.printf("The area is: %.2f%n", c3.getArea());
      //The area is: 3.14

      Circle c4 = new Circle(5.0, "blue");  // Use 3rd constructor
      System.out.println("The radius is: " + c4.getRadius());  // use dot operator to invoke member methods
      //The radius is: 5.0
      System.out.println("The color is: " + c4.getColor());
      //The color is: blue
      System.out.printf("The area is: %.2f%n", c4.getArea());
      //The area is: 78.54

      System.out.println("");
      System.out.println("");

      System.out.printf("%10s %12s %10s %16s\n", "Zirkulua", "Erradioa", "Kolorea", "Azalera");
      System.out.printf("===================================================\n");
      System.out.printf("%10s %12.2f %10s %16.2f\n", "c1", c1.getRadius(), c1.getColor(), c1.getArea());
      System.out.printf("%10s %12.2f %10s %16.2f\n", "c2", c2.getRadius(), c2.getColor(), c2.getArea());
      System.out.printf("%10s %12.2f %10s %16.2f\n", "c3", c3.getRadius(), c3.getColor(), c3.getArea());
      System.out.printf("%10s %12.2f %10s %16.2f\n", "c4", c4.getRadius(), c4.getColor(), c4.getArea());

      System.out.println("Azken zirkulua: " + c4);


      for(int i = 1;i<=10;i++){

         System.out.println(c1);
         c1.setRadius(c1.getRadius()+1);  

         if(i==6){

            c1.setColor("magenta");
            
         }
      }  
   }
}