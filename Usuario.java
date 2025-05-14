import java.util.ArrayList;
import java.util.List;

public class Usuario {
   private String nombre;
   private String correoElectronico;
   private String contrasena;
   private TarjetaDeCredito tarjeta;
   private List<HistorialReserva> historialReservas;

   public Usuario(String nombre, String correoElectronico, String contrasena, TarjetaDeCredito tarjeta) {
      this.nombre = nombre;
      this.correoElectronico = correoElectronico;
      this.contrasena = contrasena;
      this.tarjeta = tarjeta;
      this.historialReservas = new ArrayList<>();
   }

   public boolean validarCredenciales(String correo, String contrasena) {
      return this.correoElectronico.equals(correo) && this.contrasena.equals(contrasena);
   }

   public boolean validarPago(String numero, String codigo) {
      return tarjeta.validar(numero, codigo);
   }

   public void agregarHistorialReserva(HistorialReserva historial) {
      historialReservas.add(historial);
   }

   public void mostrarHistorialReservas() {
      int i = 0;
      do {
         if (i >= historialReservas.size()) break;
         historialReservas.get(i).mostrarHistorial();
         i++;
      } while (true);
   }

   public String getCorreoElectronico() {
      return correoElectronico;
   }
}
