package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

public class Principal {
    public static void main(String[] args) {

        Ciudad ciudad = new Ciudad("Loja");
        Persona persona = new Persona("Cristiano", "Ronaldo", 40, "1107071996", ciudad);

        BilleteraPagos billetera = new BilleteraPagos(persona, "Julio");

        PagoAguaPotable aguaCasa = new PagoAguaPotable(2.20, 100.2, 0.2, "residencial");
        aguaCasa.calcularPago();
        PagoAguaPotable aguaComercio = new PagoAguaPotable(2.20, 250.5, 0.2, "comercial");
        aguaComercio.calcularPago();

        PagoLuzElectrica luzCasa = new PagoLuzElectrica(10.20, 80, 0.5, "Loja");
        luzCasa.calcularPago();
        PagoLuzElectrica luzComercio = new PagoLuzElectrica(10.20, 200, 0.5, "Cuenca");
        luzComercio.calcularPago();

        PagoPredial casa1 = new PagoPredial(56000, 10);
        casa1.calcularPago();
        PagoPredial casa2 = new PagoPredial(120000, 5);
        casa2.calcularPago();

        PagoTelefonoConvencional telefonoCasa = new PagoTelefonoConvencional(6.20, 100, 0.2);
        telefonoCasa.calcularPago();
        PagoTelefonoConvencional telefonoFinca = new PagoTelefonoConvencional(6.20, 150, 0.18);
        telefonoFinca.calcularPago();

        billetera.agregarPago(aguaCasa);
        billetera.agregarPago(aguaComercio);
        billetera.agregarPago(luzCasa);
        billetera.agregarPago(luzComercio);
        billetera.agregarPago(casa1);
        billetera.agregarPago(casa2);
        billetera.agregarPago(telefonoCasa);
        billetera.agregarPago(telefonoFinca);

        System.out.println(billetera.generarReporte());
    }
}