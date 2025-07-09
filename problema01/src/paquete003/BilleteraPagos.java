package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pago;

public class BilleteraPagos {

    private Persona persona;
    private String mes;
    private ArrayList<Pago> listaPagos;

    public BilleteraPagos(Persona persona, String mes) {
        this.persona = persona;
        this.mes = mes;
        this.listaPagos = new ArrayList<>();
    }

    public void agregarPago(Pago pago) {
        listaPagos.add(pago);
    }

    public double calcularTotalPagos() {
        double total = 0;
        for (Pago p : listaPagos) {
            total += p.getValorPagado();
        }
        return total;
    }

    public String generarReporte() {
        String reporte = "";
        reporte = "Reporte de pagos para: " + persona.getNombre() + "\n";
        reporte += "Mes: " + mes + "\n";
        reporte += "-----------------------------\n";

        for (Pago p : listaPagos) {
            reporte += p.toString() + "\n";
        }

        reporte += "-----------------------------\n";
        reporte += "Total pagado: $" + String.format("%.2f", calcularTotalPagos()) + "\n";

        return reporte;
    }
}
