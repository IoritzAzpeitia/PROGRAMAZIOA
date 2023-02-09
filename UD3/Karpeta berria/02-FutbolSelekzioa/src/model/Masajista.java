package model;

public class Masajista extends IntegranteSeleccion{
    private String titulacion;
    private int aniosExperiencia;
    

    public Masajista(int id, String nombre, int edad, String apellidos, String titulacion, int aniosExperiencia) {
        super(id, nombre, edad, apellidos);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){
        System.out.println("Dar masaje.");
    }

    public String toString(){
        return "Masajista{id =" + id + ", nombre ="+nombre+", apellidos ="+this.getApellidos()+", edad="+this.getEdad() +", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia+"}";
    }
 
}
