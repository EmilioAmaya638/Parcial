import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String idReserva;
    private LocalDateTime fechaReserva;
    private String estado;
    private List<Vuelo> vuelos;
    private List<Pasajero> pasajeros;

    public Reserva(String idReserva) {
        this.idReserva = idReserva;
        this.fechaReserva = LocalDateTime.now();
        this.estado = "Confirmada";
        this.vuelos = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public String getIdReserva() {
        return idReserva;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public String getEstado() {
        return estado;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }
}
