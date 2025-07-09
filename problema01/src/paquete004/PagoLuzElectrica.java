
package paquete004;

public class PagoLuzElectrica extends Pago {

    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private String ciudad;

    public PagoLuzElectrica(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio, String ciudad) {
        
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
        this.ciudad = ciudad;
        this.descripcion = "Pago Luz Electrica - Ciudad: " + ciudad;
    }

    @Override
    
    public void calcularPago() {
        if (ciudad.equalsIgnoreCase("Loja")) {
            valorPagado = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            valorPagado = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }
}
