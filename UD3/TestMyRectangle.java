public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rec1 = new MyRectangle(new MyPoint(1, 5), new MyPoint(7, 3));
        System.out.println(rec1);
        System.out.println("  Perimetroa: " + rec1.getPerimetroa());
        System.out.println("  Azalera: " + rec1.getAzalera());
        System.out.println(""); 
    }
}
