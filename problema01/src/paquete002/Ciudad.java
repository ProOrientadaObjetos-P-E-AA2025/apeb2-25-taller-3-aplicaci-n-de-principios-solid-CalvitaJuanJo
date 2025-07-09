package paquete002;

public class Ciudad {
    private String nombreCiudad;

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombre() {
        return nombreCiudad;
    }

    public void setNombre(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return nombreCiudad;
    }
}