package paquete004;

public class PagoTelefonoConvencional extends Pago {

    private double tarifaBase;
    private double minutosConsumidos;
    private double costoPorMinuto;

    public PagoTelefonoConvencional(double tarifaBase, double minutosConsumidos, double costoPorMinuto) {
        
        this.tarifaBase = tarifaBase;
        this.minutosConsumidos = minutosConsumidos;
        this.costoPorMinuto = costoPorMinuto;
        this.descripcion = "Pago Telefono Convencional";
    }

    @Override
    
    public void calcularPago() {
        valorPagado = tarifaBase + (minutosConsumidos * costoPorMinuto);
    }
}
