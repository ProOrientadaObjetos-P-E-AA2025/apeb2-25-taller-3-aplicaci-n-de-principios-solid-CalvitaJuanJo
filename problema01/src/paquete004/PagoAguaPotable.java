package paquete004;

public class PagoAguaPotable extends Pago {

    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private String tipo;

    public PagoAguaPotable(double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos, String tipo) {
        
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
        this.tipo = tipo;
        this.descripcion = "Pago Agua Potable - Tipo: " + tipo;
    }

    @Override
    
    public void calcularPago() {
        if (tipo.equalsIgnoreCase("comercial")) {
            valorPagado = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {
            valorPagado = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }
}
