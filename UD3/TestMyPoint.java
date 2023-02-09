import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class TestMyPoint {    
    public static void main(String[] args) {
        
  
     int x;
     int y;

    System.out.println("a) Hiru puntu sortu:");
     MyPoint p0 = new MyPoint(0,0);
     MyPoint p1 = new MyPoint(2,1);
     MyPoint p2 = new MyPoint(4,0);
     System.out.println("p0 ===> " + p0);
     System.out.println("p1 ===> " + p1);
     System.out.println("p2 ===> " + p2);

     System.out.println("b) Distantziak koordenatu-jatorriarekiko:");
     System.out.println("p0 ===> " + p0.distance());
     System.out.println("p1 ===> " + p1.distance());
     System.out.println("p2 ===> " + p2.distance());

     System.out.println("c) Distantziak euren artean:");
     System.out.println("p0tik p1ra  => " + (p1.distance()-p0.distance()));
     System.out.println("p0tik p2ra  => " + (p2.distance()-p0.distance()));
     System.out.println("p1tik p2ra  => " + (p2.distance()-p1.distance()));

     System.out.println("c.2) p1 puntuaren datuak getXY() metodoa erabilita:");
     System.out.println("puntuenArraya  => " + Arrays.toString(p1.getXY()));
     
     System.out.println("d) Sortu 10 puntuko array bat. Eta automatikoki bete:");
     MyPoint[] puntuenArraia = new MyPoint[10];
     for (int i = 0; i < puntuenArraia.length; i++) {
        puntuenArraia[i] = new MyPoint(i+1,i+1); 
     }
     System.out.println(Arrays.toString(puntuenArraia));

     System.out.println("e) Sortu 100 puntuko arrayLista:");
     ArrayList<MyPoint> arraia100 = new ArrayList();
     for (int i = 0; i <= 100; i++) {
        arraia100.add(new MyPoint(i,i));  
     }
     System.out.println(arraia100);

     System.out.println("f) Sortu ausazko 5 puntuko sorta (0-9 tartean).");
     /*Random ausazkoArraia = new Random();
     for (int i = 0; i <= 5; i++) {
      (int)(Math.random()*10) = new MyPoint(a.nextInt(10),a.nextInt(10));
     }
     System.out.println(Arrays.toString(ausazkoArraia));
     */
    }
}
