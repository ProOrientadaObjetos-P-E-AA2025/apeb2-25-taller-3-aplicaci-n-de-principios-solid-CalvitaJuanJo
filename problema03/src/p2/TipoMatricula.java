package p2;

import p1.Matricula;
import java.util.ArrayList;

public class TipoMatricula {
    private double promedioMatriculas;
    private ArrayList<Matricula> listaMatriculas;

    public TipoMatricula() {
        listaMatriculas = new ArrayList<>();
    }

    public void agregarMatricula(Matricula m) {
        m.establecerTarifa(); 
        listaMatriculas.add(m);
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return listaMatriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (Matricula m : listaMatriculas) {
            suma += m.obtenerTarifa();
        }
        promedioMatriculas = listaMatriculas.isEmpty() ? 0 : suma / listaMatriculas.size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String reporte = "Tarifas de matriculas:\n";
        for (Matricula m : listaMatriculas) {
            reporte += String.format("Tarifa: %.2f\n", m.obtenerTarifa());
        }
        reporte += String.format("Promedio de tarifas: %.2f\n", obtenerPromedioTarifas());
        return reporte;
    }
}