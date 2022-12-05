public class TestZatikia {
    public static void main(String[] args) {
        
    Zatikia z1;
    z1 = new Zatikia(5,0);
    System.out.println("Lehen zatikia: "+z1);
    
    Zatikia z2;
    z2 = new Zatikia(7,2);
    System.out.println("Bigarren zatikia: "+z2);

    Zatikia z3;
    z3 = new Zatikia(3,8);
    System.out.println("Hirugarren zatikia: "+z3);

    System.out.println(z1+" * "+ z2+" = "+Zatikia.biderkatu(z1, z2));
    
    System.out.println(z1+" + "+ z2+" = "+Zatikia.batu(z1, z2));

    System.out.println(z3+"-en baliokidea "+z3.hamartarBaliokidea());

    System.out.println(z1.isBaliokidea(z2));

    System.out.println(z1.isBiggerThan(z2));

    }
}


