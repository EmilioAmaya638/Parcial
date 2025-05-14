import java.util.List;

public class HistorialReserva {
    private Compra compra;
    private List<HistorialVuelo> vuelos;
    private List<Pasajero> pasajeros;

    public HistorialReserva(Compra compra, List<HistorialVuelo> vuelos, List<Pasajero> pasajeros) {
        this.compra = compra;
        this.vuelos = vuelos;
        this.pasajeros = pasajeros;
    }

    public void mostrarHistorial() {
        System.out.println("Compra realizada el: " + compra.getFechaCompra() + " por $" + compra.getMontoTotal());
        System.out.println("Vuelos:");
        for (HistorialVuelo vuelo : vuelos) {
            vuelo.mostrar();
        }
        System.out.println("Pasajeros:");
        for (Pasajero pasajero : pasajeros) {
            System.out.println(" - " + pasajero.getNombreCompleto());
        }
    }
}
