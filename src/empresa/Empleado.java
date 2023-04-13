package empresa;

public class Empleado {
    private String nombreEmpleado;
    private int id;
    private String apellidoEmpleado;
    private double salario;
    private Direccion d1;

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }
    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Direccion getD1() {
        return d1;
    }
    public void setD1(Direccion d1) {
        this.d1 = d1;
    }
    public void mostrarInfo() {
        System.out.println("ID: " + id + "\nNombre: " + nombreEmpleado + "\nApellido: " + apellidoEmpleado + "\nSalario: " + salario);
        d1.mostrarInfoDireccion();
    }
}