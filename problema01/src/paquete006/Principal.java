package paquete006;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.*;

public class Principal {

    public static void main(String[] args) {

        Ciudad ciudad = new Ciudad("Machala");
        Persona persona = new Persona("Magdalena", "Gutierrez", 28, "1450278579", ciudad);

        BilleteraPagos billetera = new BilleteraPagos(persona, "Agosto");

        double[][] datosAguaComerciales = DatosAgua.datosComerciales();
        double[][] datosAguaCasas = DatosAgua.datosCasas();

        for (int i = 0; i < datosAguaComerciales.length; i++) {
            PagoAguaPotable pago = new PagoAguaPotable(
                    datosAguaComerciales[i][0],
                    datosAguaComerciales[i][1],
                    datosAguaComerciales[i][2],
                    "comercial"
            );
            pago.calcularPago();
            billetera.agregarPago(pago);
        }

        for (int i = 0; i < datosAguaCasas.length; i++) {
            PagoAguaPotable pago = new PagoAguaPotable(
                    datosAguaCasas[i][0],
                    datosAguaCasas[i][1],
                    datosAguaCasas[i][2],
                    "residencial"
            );
            pago.calcularPago();
            billetera.agregarPago(pago);
        }

        double[][] datosLuzLoja = DatosLuz.datosLoja();
        double[][] datosLuzGeneral = DatosLuz.datosGeneral();

        for (int i = 0; i < datosLuzLoja.length; i++) {
            PagoLuzElectrica pago = new PagoLuzElectrica(
                    datosLuzLoja[i][0],
                    datosLuzLoja[i][1],
                    datosLuzLoja[i][2],
                    "Loja"
            );
            pago.calcularPago();
            billetera.agregarPago(pago);
        }

        for (int i = 0; i < datosLuzGeneral.length; i++) {
            PagoLuzElectrica pago = new PagoLuzElectrica(
                    datosLuzGeneral[i][0],
                    datosLuzGeneral[i][1],
                    datosLuzGeneral[i][2],
                    "Quito"
            );
            pago.calcularPago();
            billetera.agregarPago(pago);
        }

        double[][] datosPropiedades = DatosPropiedades.datos();
        for (int i = 0; i < datosPropiedades.length; i++) {
            PagoPredial pago = new PagoPredial(
                    datosPropiedades[i][0],
                    datosPropiedades[i][1]
            );
            pago.calcularPago();
            billetera.agregarPago(pago);
        }

        double[][] datosTelefono = DatosTelefono.datos();
        for (int i = 0; i < datosTelefono.length; i++) {
            PagoTelefonoConvencional pago = new PagoTelefonoConvencional(
                    datosTelefono[i][0],
                    datosTelefono[i][1],
                    datosTelefono[i][2]
            );
            pago.calcularPago();
            billetera.agregarPago(pago);
        }

        System.out.println(billetera.generarReporte());
    }
}
