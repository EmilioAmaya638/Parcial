import java.time.*;
import java.util.*;

public class Vuelo {
    private String idVuelo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime horaSalida;
    private Aerolinea aerolinea;
    private double tarifa;
    private List<String> asientosDisponibles;

    public Vuelo(String idVuelo, String origen, String destino, LocalDate fecha,
                 LocalTime horaSalida, Aerolinea aerolinea, double tarifa) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.aerolinea = aerolinea;
        this.tarifa = tarifa;
        this.asientosDisponibles = generarAsientos(); // ejemplo: A1-A5, B1-B5
    }

    private List<String> generarAsientos() {
        List<String> asientos = new ArrayList<>();
        for (char fila = 'A'; fila <= 'C'; fila++) {
            for (int num = 1; num <= 5; num++) {
                asientos.add("" + fila + num);
            }
        }
        return asientos;
    }

    public void mostrarAsientosDisponibles() {
        System.out.println("Asientos disponibles:");
        for (String asiento : asientosDisponibles) {
            System.out.print(asiento + " ");
        }
        System.out.println();
    }

    public boolean reservarAsiento(String asiento) {
        return asientosDisponibles.remove(asiento);
    }

    public boolean asientoDisponible(String asiento) {
        return asientosDisponibles.contains(asiento);
    }

    public String consultarInformacion() {
        return String.format("Vuelo %s: %s → %s\nFecha: %s\nHora: %s\nAerolínea: %s\nTarifa: $%.2f",
                idVuelo, origen, destino, fecha.toString(), horaSalida.toString(), aerolinea.getNombre(), tarifa);
    }


    public String getIdVuelo() { return idVuelo; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public LocalDate getFecha() { return fecha; }
    public LocalTime getHoraSalida() { return horaSalida; }
    public Aerolinea getAerolinea() { return aerolinea; }
    public double consultarTarifa() { return tarifa; }
}
