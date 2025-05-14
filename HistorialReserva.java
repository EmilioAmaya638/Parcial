import java.util.List;

public class HistorialReserva {
    private String idHistorialReserva;
    private String idReservaReferencia;
    private String fechaReserva;
    private String estadoHistorico;
    private List<HistorialVuelo> vuelosHistoricos;
    private List<Pasajero> pasajerosHistoricos;

    public HistorialReserva(String idHistorialReserva, Reserva reserva, List<HistorialVuelo> vuelosHistoricos, List<Pasajero> pasajerosHistoricos) {
        this.idHistorialReserva = idHistorialReserva;
        this.idReservaReferencia = reserva.getIdReserva();
        this.fechaReserva = reserva.getFechaReserva().toString();
        this.estadoHistorico = reserva.getEstado();
        this.vuelosHistoricos = vuelosHistoricos;
        this.pasajerosHistoricos = pasajerosHistoricos;
    }

    public void mostrarHistorial() {
        System.out.printf("Reserva: %s | Fecha: %s | Estado: %s\n", idReservaReferencia, fechaReserva, estadoHistorico);
        for (Pasajero p : pasajerosHistoricos) {
            System.out.println("Pasajero: " + p.getNombreCompleto());
        }
        for (HistorialVuelo h : vuelosHistoricos) {
            h.mostrarHistorial();
        }
    }
}
