package empresa;

public class Cliente {
    public int id;
    public String nombre;
    public String contacto;
    public char estado;
    public Direccion direccion;

    public void mostrarInfoCliente() {
        System.out.println("ID " + id + "\nNombre del Cliente: " + nombre + "\nContacto: " + contacto + "\nEstado: " + estado);
        direccion.mostrarInfoDireccion();
    }

}
