package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Partida {
    private LocalDate data;
    private String aurkaria;
    private ArrayList<Futbolista> txartelak;

    public Partida(){
    }

    public Partida(LocalDate data, String aurkaria,ArrayList<Futbolista> txartelak){
        this.data = data;
        this.aurkaria = aurkaria;
        this.txartelak = txartelak;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAurkaria() {
        return aurkaria;
    }

    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }

    public ArrayList<Futbolista> getTxartelak() {
        return txartelak;
    }

    public void setTxartelak(ArrayList<Futbolista> txartelak) {
        this.txartelak = txartelak;
    }

    public void txartelaJarri(Futbolista f){
        this.txartelak.add(f);
    }

    public String toString(){
        return "Partida{" + "data=" + data + ", aurkaria=" + aurkaria + ", txartelak=" + txartelak + '}';
    }
}
