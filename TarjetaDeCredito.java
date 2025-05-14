public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private String codigoSeguridad;

    public TarjetaDeCredito(String numero, String fechaVencimiento, String codigoSeguridad) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    public boolean validarCodigo(String codigo) {
        return codigoSeguridad.equals(codigo);
    }
}
