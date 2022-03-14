package clases.ingles;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan Perez", NivelOralDeIngles.AVANZADO, true, 8.8);
        Empleado empleado2 = new Empleado("Carlos Gomez",  NivelOralDeIngles.AVANZADO, false);
        Empleado empleado3 = new Empleado("Maria Gimenez",  NivelOralDeIngles.INTERMEDIO, false);

        AreaDeIngles areaIngles = new AreaDeIngles("Sebastian");
        areaIngles.agregarEmpleados(empleado1);
        areaIngles.agregarEmpleados(empleado2);
        areaIngles.agregarEmpleados(empleado3);
        areaIngles.mostrarEmpleadosSegunNivel(NivelOralDeIngles.INTERMEDIO);
        areaIngles.mostrarInformacionEmpleado("Juan Perez");
        areaIngles.mostrarEmpleadosSegunNivel(NivelOralDeIngles.AVANZADO);
        areaIngles.removerEmpleado("Juan Perez");

        areaIngles.mostrarEmpleadosSegunNivel(NivelOralDeIngles.AVANZADO);

        areaIngles.mostrarTodosLosEmpleados();

    }
}
