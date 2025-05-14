import java.time.LocalDate;
import java.time.LocalTime;

public class HistorialVuelo {
    private String idHistorialVuelo;
    private String idVueloReferencia;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime horaSalida;
    private String aerolinea;
    private double tarifaHistorica;

    public HistorialVuelo(String idHistorialVuelo, Vuelo vuelo) {
        this.idHistorialVuelo = idHistorialVuelo;
        this.idVueloReferencia = vuelo.getIdVuelo();
        this.origen = vuelo.getOrigen();
        this.destino = vuelo.getDestino();
        this.fecha = vuelo.getFecha();
        this.horaSalida = vuelo.getHoraSalida();
        this.aerolinea = vuelo.getAerolinea().getNombre();
        this.tarifaHistorica = vuelo.consultarTarifa();
    }

    public String getResumen() {
        return String.format("%s → %s el %s a las %s ($%.2f)",
                origen, destino, fecha, horaSalida, tarifaHistorica);
    }

    public String getIdHistorialVuelo() {
        return idHistorialVuelo;
    }
}

