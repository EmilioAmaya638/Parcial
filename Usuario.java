import java.util.HashMap;
import java.util.Map;

public class Usuario {

   private String correoElectronico;
   private String contrasena;
   private String nombre;

   // Simulación de la base de datos de usuarios (en memoria para este ejemplo)
   private static Map<String, Usuario> usuariosRegistrados = new HashMap<>();

   // Constructor
   public Usuario(String correoElectronico, String contrasena, String nombre) {
      this.correoElectronico = correoElectronico;
      this.contrasena = contrasena;
      this.nombre = nombre;
   }

   // Getters para los atributos
   public String getCorreoElectronico() {
      return correoElectronico;
   }

   public String getContrasena() {
      return contrasena;
   }

   public String getNombre() {
      return nombre;
   }

   // Método para registrar un nuevo usuario (ahora no estático)
   public boolean registrar() {
      // 1. Validar que el correo electrónico no exista ya en el sistema
      if (existeUsuario(this.correoElectronico)) {
         System.out.println("Error: El correo electrónico " + this.correoElectronico + " ya está registrado.");
         return false;
      }

      // 2. Validar la fortaleza de la contraseña (opcional, implementación básica sin librerías)
      if (!esContrasenaSegura(this.contrasena)) {
         System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
         return false;
      }

      // 3. Guardar el nuevo usuario en el sistema
      guardarUsuario(this);

      System.out.println("Usuario " + this.nombre + " registrado exitosamente.");
      return true;
   }

   // Método para validar las credenciales del usuario actual (ahora no estático)
   public boolean validarCredenciales(String contrasenaIngresada) {
      // 1. Verificar si la contraseña ingresada coincide con la contraseña del usuario
      if (this.contrasena.equals(contrasenaIngresada)) {
         System.out.println("Inicio de sesión exitoso para: " + this.nombre);
         return true;
      } else {
         System.out.println("Error: Contraseña incorrecta para el usuario " + this.correoElectronico + ".");
         return false;
      }
   }

   // Métodos auxiliares (ahora estáticos para la gestión global de usuarios)
   private static boolean existeUsuario(String correoElectronico) {
      return usuariosRegistrados.containsKey(correoElectronico);
   }

   private static boolean esContrasenaSegura(String contrasena) {
      // Implementación básica sin librerías extras
      return contrasena != null && contrasena.length() >= 8;
   }

   private static void guardarUsuario(Usuario usuario) {
      usuariosRegistrados.put(usuario.correoElectronico, usuario);
   }

   public static Usuario buscarUsuarioPorCorreo(String correoElectronico) {
      return usuariosRegistrados.get(correoElectronico);
   }

}