package model;

public class Untitled {
    private char bat,bi,hiru,lau,bost,sei;


    /*public array3(){
    }

    public array3(char bat,char bi, char hiru,char lau, char bost, char sei){
        this.bat = bat;
        this.bi = bi;
        this.hiru = hiru;
        this.lau = lau;
        this.bost= bost;
        this.sei = sei;
    }

    public char getBat() {
        return bat;
    }
    public void setBat(char bat) {
        this.bat = bat;
    }
    public char getBi() {
        return bi;
    }
    public void setBi(char bi) {
        this.bi = bi;
    }
    public char getHiru() {
        return hiru;
    }
    public void setHiru(char hiru) {
        this.hiru = hiru;
    }
    public char getLau() {
        return lau;
    }
    public void setLau(char lau) {
        this.lau = lau;
    }
    public char getBost() {
        return bost;
    }
    public void setBost(char bost) {
        this.bost = bost;
    }
    public char getSei() {
        return sei;
    }
    public void setSei(char sei) {
        this.sei = sei;
    }*/
    
    public static void main(String[] args) {
        char letra1 = "E23-01".charAt(0);
        char [] array1 = {'E','2','3','-','0','1'};

        String strKode = "e23-02";        //String[] kodeaStringZatitan = strKode.split("-");
        char [] kodea = new char[strKode.length()];
        char[] kodea2;
        kodea2 = strKode.toCharArray();
        

        for (int i = 0; i < strKode.length(); i++) {
            kodea[i] = strKode.charAt(i);
        }

        System.out.println(letra1);
        System.out.println(array1);
        System.out.println(kodea);
    }
}
