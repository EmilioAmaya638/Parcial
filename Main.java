import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear aerolíneas
        Aerolinea a1 = new Aerolinea("AV", "Avianca");
        Aerolinea a2 = new Aerolinea("LA", "Latam");
        Aerolinea a3 = new Aerolinea("VE", "Viva Air");

        // Crear vuelos
        Vuelo v1 = new Vuelo("V001", "Bogotá", "Medellín", "2025-05-20", "10:00", a1, 250000);
        Vuelo v2 = new Vuelo("V002", "Bogotá", "Cali", "2025-05-21", "14:00", a2, 180000);
        Vuelo v3 = new Vuelo("V003", "Bogotá", "Cartagena", "2025-05-22", "09:00", a3, 300000);

        List<Vuelo> vuelosDisponibles = Arrays.asList(v1, v2, v3);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Correo electrónico: ");
        String correo = sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();
        Usuario usuario = new Usuario(correo, contrasena, nombre);

        System.out.print("¿Cuántos pasajeros incluirá en la compra? ");
        int numPasajeros = sc.nextInt();
        sc.nextLine();
        List<Pasajero> pasajeros = new ArrayList<>();
        for (int i = 0; i < numPasajeros; i++) {
            System.out.print("Nombre: ");
            String n = sc.nextLine();
            System.out.print("Apellido: ");
            String a = sc.nextLine();
            System.out.print("Fecha nacimiento: ");
            String fn = sc.nextLine();
            System.out.print("Contacto: ");
            String c = sc.nextLine();
            pasajeros.add(new Pasajero(n, a, fn, c));
        }

        List<Vuelo> vuelosReservados = new ArrayList<>();
        List<HistorialVuelo> historialVuelos = new ArrayList<>();
        double total = 0;

        String seguir;
        do {
            System.out.println("Vuelos disponibles:");
            for (Vuelo v : vuelosDisponibles) {
                v.consultarInformacion();
            }

            System.out.print("Seleccione ID de vuelo: ");
            String id = sc.nextLine();
            Vuelo seleccionado = null;
            for (Vuelo v : vuelosDisponibles) {
                if (v.getIdVuelo().equals(id)) {
                    seleccionado = v;
                    break;
                }
            }

            if (seleccionado != null) {
                seleccionado.consultarInformacion();
                System.out.print("Seleccione un asiento disponible: ");
                String asiento = sc.nextLine();
                if (seleccionado.reservarAsiento(asiento)) {
                    vuelosReservados.add(seleccionado);
                    historialVuelos.add(new HistorialVuelo(seleccionado));
                    total += seleccionado.getTarifa();
                    System.out.println("Asiento reservado con éxito.");
                } else {
                    System.out.println("Asiento no disponible.");
                }
            }

            System.out.print("¿Desea reservar otro vuelo? (s/n): ");
            seguir = sc.nextLine();
        } while (seguir.equalsIgnoreCase("s"));

        System.out.print("Ingrese número de tarjeta: ");
        String numTarjeta = sc.nextLine();
        System.out.print("Fecha de vencimiento: ");
        String fecha = sc.nextLine();
        System.out.print("Código de seguridad: ");
        String cod = sc.nextLine();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(numTarjeta, fecha, cod);

        System.out.print("Ingrese código de seguridad para pagar: ");
        String codigoPago = sc.nextLine();

        if (tarjeta.validarCodigo(codigoPago)) {
            Compra compra = new Compra("2025-05-14", total);
            HistorialReserva historial = new HistorialReserva(compra, historialVuelos, pasajeros);
            usuario.agregarHistorialReserva(historial);
            System.out.println("Compra exitosa.");
        } else {
            System.out.println("Pago rechazado.");
        }

        System.out.println("\n==== HISTORIAL DE RESERVAS ====");
        for (HistorialReserva h : usuario.getHistoriales()) {
            h.mostrarHistorial();
            System.out.println("--------------------------");
        }

        sc.close();
    }
}

