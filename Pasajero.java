public class Pasajero {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String informacionContacto;

    public Pasajero(String nombre, String apellido, String fechaNacimiento, String informacionContacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.informacionContacto = informacionContacto;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
