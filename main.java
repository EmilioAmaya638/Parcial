public class main {
    public static void main(String[] args) {

            // Ejemplo de uso de los métodos

            // Registrar dos usuarios
            Usuario usuario1 = new Usuario("nuevo.usuario@email.com", "ContraseñaSegura123", "Nuevo Usuario");
            usuario1.registrar();

            Usuario usuario2 = new Usuario("otro.usuario@email.com", "claveCorta", "Otro Usuario");
            usuario2.registrar(); // Fallará por contraseña corta

            // Intentar iniciar sesión
            Usuario usuarioLogueado1 = Usuario.buscarUsuarioPorCorreo("nuevo.usuario@email.com");
            if (usuarioLogueado1 != null) {
                usuarioLogueado1.validarCredenciales("ContraseñaSegura123"); // Éxito
                usuarioLogueado1.validarCredenciales("ContraseñaIncorrecta"); // Fallo
            }

            Usuario usuarioLogueado2 = Usuario.buscarUsuarioPorCorreo("otro.usuario@email.com");
            if (usuarioLogueado2 != null) {
                usuarioLogueado2.validarCredenciales("claveCorta"); // Éxito
            }
        }
    }




