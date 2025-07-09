package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    
    private ArrayList<Televisor> televisores;

    public VentasTvs() {
        televisores = new ArrayList<>();
    }

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void agregarTelevisor(Televisor tv) {
        televisores.add(tv);
    }

    public double obtenerPrecioTotal() {
        double suma = 0;
        for (Televisor tv : televisores) {
            suma += tv.obtenerPrecio();
        }
        return suma;
    }

    public String obtenerMarcasVendidas() {
        StringBuilder marcas = new StringBuilder();
        for (Televisor tv : televisores) {
            marcas.append(tv.obtenerMarca()).append("\n");
        }
        return marcas.toString();
    }
}