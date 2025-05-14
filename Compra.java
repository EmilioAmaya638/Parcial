import java.time.LocalDateTime;

public class Compra {
    private String idCompra;
    private LocalDateTime fechaCompra;
    private double montoTotal;

    public Compra(String idCompra, double montoTotal) {
        this.idCompra = idCompra;
        this.fechaCompra = LocalDateTime.now();
        this.montoTotal = montoTotal;
    }

    public void realizarPago(TarjetaDeCredito tarjeta) {
        System.out.println("Procesando pago con tarjeta: " + tarjeta.getNumeroTarjeta());
    }

    public void generarBoleto() {
        System.out.println("Boleto generado para compra " + idCompra);
    }
}

