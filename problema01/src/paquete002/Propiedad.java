package paquete002;

public class Propiedad {
    
    private double costoPropiedad;

    public Propiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public double getCostoPropiedad() {
        return costoPropiedad;
    }

    public void setCostoPropiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    @Override
    public String toString() {
        return "Costo de la propiedad: $" + String.format("%.2f", costoPropiedad);
        
    }
}
