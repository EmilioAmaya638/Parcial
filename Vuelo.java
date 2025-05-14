import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String idVuelo;
    private String origen;
    private String destino;
    private String fecha;
    private String horaSalida;
    private Aerolinea aerolinea;
    private double tarifa;
    private List<String> asientosDisponibles;

    public Vuelo(String idVuelo, String origen, String destino, String fecha, String hora, Aerolinea aerolinea, double tarifa) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = hora;
        this.aerolinea = aerolinea;
        this.tarifa = tarifa;
        this.asientosDisponibles = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            asientosDisponibles.add("A" + i);
        }
    }

    public boolean reservarAsiento(String asiento) {
        return asientosDisponibles.remove(asiento);
    }

    public void consultarInformacion() {
        System.out.println("Vuelo: " + idVuelo + " - " + origen + " a " + destino +
                ", Fecha: " + fecha + ", Hora: " + horaSalida +
                ", Aerolinea: " + aerolinea.getNombre() + ", Tarifa: $" + tarifa);
        System.out.println("Asientos disponibles: " + asientosDisponibles);
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public double getTarifa() {
        return tarifa;
    }
}
