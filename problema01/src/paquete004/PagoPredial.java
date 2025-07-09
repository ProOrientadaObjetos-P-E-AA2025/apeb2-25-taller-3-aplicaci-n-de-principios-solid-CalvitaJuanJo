
package paquete004;

public class PagoPredial extends Pago {

    private double valorPropiedad;
    private double porcentajeDescuento;

    public PagoPredial(double valorPropiedad, double porcentajeDescuento) {
        this.valorPropiedad = valorPropiedad;
        this.porcentajeDescuento = porcentajeDescuento;
        this.descripcion = "Pago Predial";
    }

    @Override
    public void calcularPago() {
        valorPagado = valorPropiedad - ((valorPropiedad * porcentajeDescuento) / 100);
    }
}
