
package paquete01;

import java.util.ArrayList;

public class Gestorventv {
    
    public double totalPrecioTvs(ArrayList<Televisor> tvs) {
        double suma = 0;
        for (Televisor tv : tvs) {
            suma += tv.obtenerPrecio();
        }
        return suma;
    }

    public String listaMarcasVendidas(ArrayList<Televisor> tvs) {
        String marcas = "";
        for (Televisor tv : tvs) {
            marcas = marcas + tv.obtenerMarca() + "\n";
        }
        return marcas;
    }

    public double televisorMasCaro(ArrayList<Televisor> tvs) {
        double max = 0;
        for (Televisor tv : tvs) {
            if (tv.obtenerPrecio() > max) {
                max = tv.obtenerPrecio();
            }
        }
        return max;
    }
}