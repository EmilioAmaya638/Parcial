import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class HistorialReserva {
    private String idHistorialReserva;
    private String idReservaReferencia;
    private LocalDateTime fechaReserva;
    private String estadoHistorico;
    private Map<HistorialVuelo, String> vuelosYAsientosHistoricos;
    private List<Pasajero> pasajerosHistoricos;

    public HistorialReserva(String idHistorialReserva, String idReservaReferencia,
                            LocalDateTime fechaReserva, String estadoHistorico,
                            List<Pasajero> pasajerosHistoricos) {
        this.idHistorialReserva = idHistorialReserva;
        this.idReservaReferencia = idReservaReferencia;
        this.fechaReserva = fechaReserva;
        this.estadoHistorico = estadoHistorico;
        this.pasajerosHistoricos = pasajerosHistoricos;
        this.vuelosYAsientosHistoricos = new HashMap<>();
    }

    public void agregarVueloHistorico(HistorialVuelo vuelo, String asiento) {
        vuelosYAsientosHistoricos.put(vuelo, asiento);
    }

    public void mostrarHistorial() {
        System.out.println("\nHistorial de reserva " + idHistorialReserva + ":");
        System.out.println("Estado: " + estadoHistorico + " | Fecha: " + fechaReserva);
        for (Map.Entry<HistorialVuelo, String> entry : vuelosYAsientosHistoricos.entrySet()) {
            HistorialVuelo vuelo = entry.getKey();
            String asiento = entry.getValue();
            System.out.printf("Vuelo histórico %s: %s → %s el %s a las %s | Asiento reservado: %s | Aerolínea: %s | Tarifa: $%.2f\n",
                    vuelo.getIdHistorialVuelo(), vuelo.getOrigen(), vuelo.getDestino(), vuelo.getFecha(),
                    vuelo.getHoraSalida(), asiento, vuelo.getAerolinea(), vuelo.getTarifaHistorica());
        }
    }

    // Getters y setters necesarios
    public String getIdHistorialReserva() {
        return idHistorialReserva;
    }

    public String getIdReservaReferencia() {
        return idReservaReferencia;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public String getEstadoHistorico() {
        return estadoHistorico;
    }

    public Map<HistorialVuelo, String> getVuelosYAsientosHistoricos() {
        return vuelosYAsientosHistoricos;
    }

    public List<Pasajero> getPasajerosHistoricos() {
        return pasajerosHistoricos;
    }
}
