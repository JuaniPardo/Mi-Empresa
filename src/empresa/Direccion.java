package empresa;

public class Direccion {
    public String calle;
    public int num;
    public String provincia;
    public void mostrarInfoDireccion() {
        System.out.println("Dirección: " + calle + " " + num + ", " + provincia);
    };
}
