package clases.ingles;

import java.util.ArrayList;

public class AreaDeIngles {

    private String profesor;
    private ArrayList<Empleado> empleados;
    private NivelOralDeIngles nivelOralDeIngles;

    public AreaDeIngles(String profesor){
        this.profesor = profesor;
        empleados = new ArrayList<>();
    }

    public void mostrarEmpleadosSegunNivel(NivelOralDeIngles nivelOralDeIngles){
        ArrayList<Empleado> empleadosSegunNivel = new ArrayList<>();
        int i = 0;
             for (Empleado empleado : empleados) {
                 if(empleado.getNivelOralDeIngles().equals(nivelOralDeIngles)){
                    empleadosSegunNivel.add(empleado);
                    i++;
                 }
             }
        System.out.println("Los empleados con nivel oral " + nivelOralDeIngles + " son: ");

             for(Empleado empleado : empleadosSegunNivel){
            System.out.println(empleado.toString2());

        }
        }



    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }

    //TODO otro agregar para agregar desde constructor aca

    public void mostrarInformacionEmpleado(String nombre){
        for (Empleado empleado : empleados){
            if(empleado.toString2().equals(nombre)) {
                System.out.println("La informacion del empleado ingresado es: \n" + empleado);
            }
        }
    }

    public void mostrarTodosLosEmpleados(){
        System.out.println("Los siguientes empleados estan cursando las clases de ingles y esta es su informacion:");
        for (Empleado empleado : empleados){
            System.out.println(empleado.toString());
        }
    }

    public void removerEmpleado(String nombre){
        for (Empleado empleado : empleados){
            if(empleado.toString2().equals(nombre)){
                empleados.remove(empleado);
                break;
            }
        }
    }


}
