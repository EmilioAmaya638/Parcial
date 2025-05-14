public class HistorialVuelo {
    private String idHistorialVuelo;
    private String idVueloReferencia;
    private String origen;
    private String destino;
    private String fecha;
    private String horaSalida;
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
        this.tarifaHistorica = vuelo.getTarifa();
    }

    public void mostrarHistorial() {
        System.out.printf("Historial Vuelo [%s] %s → %s | Fecha: %s | Hora: %s | Aerolínea: %s | Tarifa: %.2f\n",
                idVueloReferencia, origen, destino, fecha, horaSalida, aerolinea, tarifaHistorica);
    }
}

