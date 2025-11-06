public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public double getsueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setsueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String mostrarDatos() {
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }
}