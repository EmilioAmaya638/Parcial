import java.util.List;

public class Compra {
    private String fechaCompra;
    private double montoTotal;

    public Compra(String fechaCompra, double montoTotal) {
        this.fechaCompra = fechaCompra;
        this.montoTotal = montoTotal;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }
}

