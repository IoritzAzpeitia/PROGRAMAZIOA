public class CylinderComputation { 
    public static void main(String[] args) {
 
       double radius, heigth, volume, baseArea, surfaceArea ;
       final double PI = 3.14159265;
       
       radius = 5;
       heigth = 3;
       volume = PI * radius * radius * heigth;
       baseArea = PI * (radius * radius);
       surfaceArea = 2 * PI * radius * heigth + 2 * PI * (radius * radius);
   
       
       System.out.print("The radius is ");  
       System.out.println(radius);          
       System.out.print("The height is ");
       System.out.println(heigth);
       System.out.print("The surface Area is ");
       System.out.println(surfaceArea);
       System.out.print("The base Area is ");
       System.out.println(baseArea);       
       System.out.print("The volume is ");
       System.out.println(volume);
    }
 }