public class Aerolinea {
    private String codigoAerolinea;
    private String nombre;

    public Aerolinea(String codigo, String nombre) {
        this.codigoAerolinea = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
