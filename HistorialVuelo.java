public class HistorialVuelo {
    private String idVuelo;
    private String origen;
    private String destino;
    private String fecha;
    private String horaSalida;
    private String aerolinea;
    private double tarifa;

    public HistorialVuelo(Vuelo vuelo) {
        this.idVuelo = vuelo.getIdVuelo();
        this.origen = vuelo.getOrigen();
        this.destino = vuelo.getDestino();
        this.fecha = vuelo.getFecha();
        this.horaSalida = vuelo.getHoraSalida();
        this.aerolinea = vuelo.getAerolinea().getNombre();
        this.tarifa = vuelo.getTarifa();
    }

    public void mostrar() {
        System.out.println("- " + aerolinea + ": " + origen + " -> " + destino + " el " + fecha + " a las " + horaSalida + " ($" + tarifa + ")");
    }
}

