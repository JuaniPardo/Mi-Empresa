package empresa;

public class Direccion {
    private String calle;
    private int num;
    private String provincia;

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void mostrarInfoDireccion() {
        System.out.println("Dirección: " + calle + " " + num + ", " + provincia);
    };
}
