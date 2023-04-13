package empresa;

public class Cliente {
    private int id;
    private String nombre;
    private String contacto;
    private char estado;
    private Direccion direccion;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public void mostrarInfoCliente() {
        System.out.println("ID " + id + "\nNombre del Cliente: " + nombre + "\nContacto: " + contacto + "\nEstado: " + estado);
        direccion.mostrarInfoDireccion();
    }
}
