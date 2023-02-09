package model;

public class Futbolista extends IntegranteSeleccion {
    private int dorsal;
    private Demarkazioa demarcacion;

    
    public Futbolista(int dorsal, Demarkazioa demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    

    public Futbolista(int id, String nombre, int edad, String apellidos, int dorsal, Demarkazioa demarcacion) {
        super(id, nombre, edad, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrenar(){
        System.out.println("Entrenar.");
    }

    public void jugarPartido(){
        System.out.println("jugarPartido.");
    }

    public String toString(){
        return "Futbolista{id =" + id + ", nombre ="+nombre+", apellidos ="+this.getApellidos()+", edad="+this.getEdad() +", dorsal="+ dorsal +", demarkazioa"+ demarcacion+"}";
    }


    
}
