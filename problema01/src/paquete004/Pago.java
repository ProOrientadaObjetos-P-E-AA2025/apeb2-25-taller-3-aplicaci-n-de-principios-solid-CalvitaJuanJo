
package paquete004;

/**
 *
 * @author juanj
 */
public abstract class Pago {
    
    protected double valorPagado;
    protected String descripcion;

    public abstract void calcularPago();

    public double getValorPagado() {
        return valorPagado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion + " - Valor pagado: $" + String.format("%.2f", valorPagado);
    }
}
