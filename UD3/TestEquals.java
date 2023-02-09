public class TestEquals {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(9,7);
        MyPoint p2 = new MyPoint(7,8);
        MyPoint p3;

        //System.out.println(p1==p3);//datu primitiboekin bakarrik
        



        if (p1.equals(p2)) {
            System.out.println("Berdiñak");//equals berria definitu dugulako, dira berdinak
        } else {
            System.out.println("Ez dira berdinak.");
        }
    }
    
}
