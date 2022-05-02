package clases.ingles;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class AreaDeIngles {

    private String profesor;
    private ArrayList<Empleado> empleados;

    public AreaDeIngles(String profesor) {
        this.profesor = profesor;
        empleados = new ArrayList<>();
    }

    public void mostrarEmpleadosSegunNivel(NivelOralDeIngles nivelOralDeIngles) {
        ArrayList<Empleado> empleadosSegunNivel = new ArrayList<>();
        int i = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getNivelOralDeIngles().equals(nivelOralDeIngles)) {
                empleadosSegunNivel.add(empleado);
                i++;
            }
        }
        System.out.println("Los empleados con nivel oral " + nivelOralDeIngles + " son: ");
        for (Empleado empleado : empleadosSegunNivel) {
            System.out.println(empleado.retornarNombre());
        }
    }

    public void agregarEmpleados(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarEmpleadosDesdeCeroConExamen(String nombre, NivelOralDeIngles nivelOralDeIngles, boolean dioExamenEscrito, double notaExamenEscrito) {
        Empleado empleadoNuevo = new Empleado(nombre, nivelOralDeIngles, dioExamenEscrito, notaExamenEscrito);
        empleados.add(empleadoNuevo);
    }

    public void agregarEmpleadosDesdeCeroSinExamen(String nombre, NivelOralDeIngles nivelOralDeIngles, boolean dioExamenEscrito) {
        Empleado empleadoNuevo = new Empleado(nombre, nivelOralDeIngles, dioExamenEscrito);
        empleados.add(empleadoNuevo);
    }

    public void mostrarInformacionEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.mismoNombre(nombre)) {
                System.out.println("La informacion del empleado ingresado es: \n" + empleado);
            }
        }
    }

    public void mostrarTodosLosEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }
    //TODO hacer esto con while y no for y break
    public void removerEmpleado(String nombre) {
       /*
        int i = 0;
       int count = empleados.size();
       while(!(empleados.get(i).mismoNombre(nombre)) && i < count - 1){
           if ((empleados.get(i).mismoNombre(nombre))){
               empleados.remove(i);
               System.out.println("Se ha removido del sistema a " + empleados.get(i).getNombre(nombre));
           }else {
               i++;
           }
       }

        empleados.remove(i);
        System.out.println("Se ha removido del sistema a " + empleados.get(i).getNombre(nombre));
        */

       for (Empleado empleado : empleados) {
            if (empleado.mismoNombre(nombre)) {
                empleados.remove(empleado);
                break;
            }
        }

    }
    //TODO arreglar esto, no me devuelve el empleado
    public Empleado buscarEmpleadoPorNombre(String nombre) {
        //int i = 0;
        //Empleado empleadoARetornar = empleados.get(i);
        int count = empleados.size();
        //boolean mismoEmpleado = false;
        for (int i = 0; i < count; i++) {
            if ((empleados.get(i).mismoNombre(nombre))) {
                return empleados.get(i);
            }
        }
        return null;
    }
//        while (!empleados.get(i).mismoNombre(nombre) || i < count) {
//            if ((empleados.get(i).mismoNombre(nombre))) {
//                empleadoARetornar = empleados.get(i);
//            } else {
//                i++;
//            }
//        }

        //        while( !(empleados.get(i).mismoNombre(nombre)) || i < count ){
//            if ((empleados.get(i).mismoNombre(nombre))){
//                empleadoARetornar = empleados.get(i);
//                }else {
//            i++;
//            }



}
