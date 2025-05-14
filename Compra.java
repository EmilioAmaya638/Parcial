import java.time.LocalDateTime;

public class Compra {
    private String idCompra;
    private LocalDateTime fechaCompra;
    private double montoTotal;

    public Compra(String idCompra, double montoTotal) {
        this.idCompra = idCompra;
        this.montoTotal = montoTotal;
        this.fechaCompra = LocalDateTime.now();
    }

    public void generarBoleto() {
        System.out.printf("Compra #%s | Fecha: %s | Monto total: %.2f\n", idCompra, fechaCompra, montoTotal);
    }
}

