import java.util.ArrayList;
import java.util.List;

public class Usuario {
   private String correoElectronico;
   private String contrasena;
   private String nombre;
   private List<HistorialReserva> historiales;

   public Usuario(String correoElectronico, String contrasena, String nombre) {
      this.correoElectronico = correoElectronico;
      this.contrasena = contrasena;
      this.nombre = nombre;
      this.historiales = new ArrayList<>();
   }

   public boolean validarCredenciales(String correo, String contra) {
      return correoElectronico.equals(correo) && contrasena.equals(contra);
   }

   public void agregarHistorialReserva(HistorialReserva historial) {
      historiales.add(historial);
   }

   public List<HistorialReserva> getHistoriales() {
      return historiales;
   }

   public String getCorreoElectronico() {
      return correoElectronico;
   }

   public String getNombre() {
      return nombre;
   }
}
