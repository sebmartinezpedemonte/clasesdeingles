package clases.ingles;

public class Empleado {

    private String nombre;
    private NivelOralDeIngles nivelOralDeIngles;
    private boolean dioExamenEscrito;
    private double notaExamenEscrito;

    public Empleado(String nombre, NivelOralDeIngles nivelOralDeIngles, boolean dioExamenEscrito, double notaExamenEscrito) {
        this.nombre = nombre;
        this.nivelOralDeIngles = nivelOralDeIngles;
        this.dioExamenEscrito = dioExamenEscrito;
        this.notaExamenEscrito = notaExamenEscrito;
    }

    public Empleado(String nombre, NivelOralDeIngles nivelOralDeIngles, boolean dioExamenEscrito) {
        this.nombre = nombre;
        this.nivelOralDeIngles = nivelOralDeIngles;
        this.dioExamenEscrito = dioExamenEscrito;
    }

    public String getNombre(String nombre) {
        return this.nombre;
    }

    public NivelOralDeIngles getNivelOralDeIngles() {
        return nivelOralDeIngles;
    }

    public boolean isDioExamenEscrito() {
        return dioExamenEscrito;
    }

    public double getNotaExamenEscrito() {
        return notaExamenEscrito;
    }

    public String toString2(){
        return nombre;

    }

    @Override
    public String toString() {
        if(dioExamenEscrito){
            return
                    nombre +  ", nivel oral de ingles " + nivelOralDeIngles +
                    " y nota de examen escrito de " + notaExamenEscrito;

        }else

        return nombre +  ", nivel oral de Ingles " + nivelOralDeIngles + " y quien no rindio el examen escrito.";
    }



}
