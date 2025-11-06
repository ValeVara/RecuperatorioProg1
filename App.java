import java.nio.channels.Pipe.SourceChannel;

public class App { 
    public static void main(String[] args) throws Exception {
        Empleado emp1 = new Empleado("Juan Perez", 72000);
        Empleado emp2 = new Empleado("Maria Lopez", 65000);
        System.out.println(emp1.mostrarDatos());
        System.out.println(emp2.mostrarDatos());
        System.out.println("-------------------");

        Desarrollador dev1 = new Desarrollador("Ana Gomez", 87000, "Java");
        Desarrollador dev2 = new Desarrollador("Luis Martinez", 93000, "Python");
        System.out.println(dev1.mostrarDatos());
        System.out.println(dev2.mostrarDatos());
        System.out.println("-------------------");

        Gerente ger1 = new Gerente("Carlos Ruiz", 110000, "Ventas");
        Gerente ger2 = new Gerente("Sofia Fernandez", 100000, "Marketing");
        System.out.println(ger1.mostrarDatos());
        System.out.println(ger2.mostrarDatos());
        System.out.println("-------------------\n");


        System.out.println("--DEMOSTRACION DE POLIMORFISMO--");
        Empresa miEmpresa = new Empresa();

        System.out.println("Llamada con Desarrollador:");
        miEmpresa.mostrarDatos(dev1);
        miEmpresa.mostrarDatos(dev2);
        System.out.println("-------------------");
        System.out.println("Llamada con Gerente:");
        miEmpresa.mostrarDatos(ger1);
        miEmpresa.mostrarDatos(ger2);
        System.out.println("-------------------\n");

        Empleado[] empleados = { emp1, emp2, dev1, dev2, ger1, ger2 };
        miEmpresa.ordenarPorSueldo(empleados);
        System.out.println("Empleados ordenados por sueldo:");
        for (Empleado emp : empleados) {
            miEmpresa.mostrarDatos(emp);
        }

        //buscar empleado por nombre
        System.out.println("\nBusqueda de empleado por nombre:");
        miEmpresa.buscarPorNombre(empleados, "Ana Gomez");
        miEmpresa.buscarPorNombre(empleados, "Pedro Sanchez");
    }
}