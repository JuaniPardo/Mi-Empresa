package empresa;

public class Empleado {
    public String nombreEmpleado;
    public int id;
    public String apellidoEmpleado;
    public double salario;
    public Direccion d1;

    public void mostrarInfo() {
        System.out.println("ID: " + id + "\nNombre: " + nombreEmpleado + "\nApellido: " + apellidoEmpleado + "\nSalario: " + salario);
        d1.mostrarInfoDireccion();
    }
}