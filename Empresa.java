public class Empresa {
    public void mostrarDatos(Empleado empleado) {

        String datos = empleado.mostrarDatos();
        System.out.println(datos);
    }

    public void ordenarPorSueldo(Empleado[] empleados) {
        for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = 0; j < empleados.length - 1 - i; j++) {
                if (empleados[j].getsueldo() < empleados[j + 1].getsueldo()) {
                    Empleado temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                }
            }
        }
    }

    public void buscarPorNombre(Empleado[] empleados, String nombre) {
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Empleado encontrado: " + emp.mostrarDatos());
                return;
            }
        }
        System.out.println("Empleado no encontrado con el nombre: " + nombre);
    }
}