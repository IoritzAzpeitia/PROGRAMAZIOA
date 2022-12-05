public class Zatikia {
    
    private int zenbakitzailea;
    private int izendatzailea;    

    public Zatikia(int zenbakizailea, int izendatzailea){
        this.zenbakitzailea = zenbakizailea;
        this.izendatzailea = izendatzailea;
    }

    public int getZenbakitzailea(){
        return zenbakitzailea;
    }

    public int getIzendatzailea(){
        return izendatzailea;
    }

    public void setZenbakitzailea(int zenbakitzaileBerria){
        zenbakitzailea = zenbakitzaileBerria;
    }

    public void setIzendatzailea(int izendatzaileBerria){
        izendatzailea = izendatzaileBerria;
    }

    public String toString(){
        return  zenbakitzailea + "/" + izendatzailea;
    }

    public static Zatikia biderkatu(Zatikia z1,Zatikia z2){
        int zenbakitzaileBerria = z1.zenbakitzailea * z2.zenbakitzailea;
        int izendatzaileBerria = z1.izendatzailea * z2.izendatzailea;
        return new Zatikia(zenbakitzaileBerria,izendatzaileBerria);

    }  
    public static Zatikia batu(Zatikia z1,Zatikia z2){
        int baturaZenbakitzailea  = z1.zenbakitzailea * z2.izendatzailea +z1.izendatzailea*z2.zenbakitzailea;
        int baturaIzendatzailea = z1.izendatzailea * z2.izendatzailea;
        return new Zatikia(baturaZenbakitzailea, baturaIzendatzailea);
    }
    /*public void batu (Zatikia besteZatBat){
    }*/
    public double hamartarBaliokidea (){
        return (double) this.izendatzailea / this.zenbakitzailea;
    }
    public boolean isBaliokidea(Zatikia besteZatikiBat){
        return this.hamartarBaliokidea() == besteZatikiBat.hamartarBaliokidea();
    } 
    public boolean isBiggerThan(Zatikia besteZatikiBat){
        boolean handiagoa = false;
        if (this.zenbakitzailea / this.izendatzailea >= this.zenbakitzailea / this.izendatzailea);
        return handiagoa;
    }
}


