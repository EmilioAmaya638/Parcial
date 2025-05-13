import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Vuelo {

    private String idVuelo;
    public String nombre;
    public String origen;
    public String destino;
    public Date fecha;
    public Time horaSalida;
    public String aeroLinea;
    public int tarifa;
    public int asientosDisponibles;

    public Vuelo(LocalTime horaSalida ,String idVuelo,String nombre,String origen,String destino,LocalDate fecha,int tarifa,int asientosDisponibles) {

        this.idVuelo = idVuelo;
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.tarifa = tarifa;
        this.asientosDisponibles = asientosDisponibles;

    }
    public String getIdVuelo() {
        return idVuelo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public Date getFecha() {
        return fecha;
    }
    public int getTarifa() {
        return tarifa;
    }
    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
    public String getAeroLinea() {
        return aeroLinea;
    }
    public String gethoraSalida() {
        return horaSalida.toString();
    }

    public static Vuelo generarVueloAleatorio() {
        Random random = new Random();

        // Generar ID aleatorio
        String idVuelo = UUID.randomUUID().toString();

        // Lista de posibles orígenes y destinos (puedes expandir esto)
        String[] origenes = {"Bogotá", "Medellín", "Cali", "Barranquilla", "Cartagena"};
        String[] destinos = {"Nueva York", "Madrid", "Miami", "Ciudad de México", "Buenos Aires"};

        String origen = origenes[random.nextInt(origenes.length)];
        String destino = destinos[random.nextInt(destinos.length)];

        // Asegurar que origen y destino sean diferentes
        while (origen.equals(destino)) {
            destino = destinos[random.nextInt(destinos.length)];
        }

        // Generar fecha aleatoria dentro de un rango (ejemplo: próximos 30 días)
        LocalDate fechaAleatoria = LocalDate.now().plusDays(random.nextInt(30));

        // Generar hora de salida aleatoria
        LocalTime horaSalidaAleatoria = LocalTime.of(random.nextInt(24), random.nextInt(60));

        // Lista de aerolíneas
        String[] aerolineas = {"Avianca", "LATAM", "Viva Air", "Copa Airlines", "American Airlines"};
        String aerolineaAleatoria = aerolineas[random.nextInt(aerolineas.length)];

        // Generar tarifa aleatoria (entero)
        int tarifaAleatoria = random.nextInt(500) + 50; // Tarifa entre 50 y 549

        // Generar número de asientos disponibles aleatorio
        int asientosAleatorios = random.nextInt(200) + 50; // Asientos entre 50 y 249

        return new Vuelo(idVuelo, origen, destino, fechaAleatoria, horaSalidaAleatoria, aerolineaAleatoria, tarifaAleatoria, asientosAleatorios);
    }


}
