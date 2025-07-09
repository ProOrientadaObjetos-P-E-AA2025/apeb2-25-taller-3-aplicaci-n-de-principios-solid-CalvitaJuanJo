package paquete001;
import paquete002.Ciudad;

public class Persona {
    String nombre;
    String apellido;
    int edad;
    String cedula;
    public Ciudad ciudad;
    
    public Persona(String nombre, String apellido, int edad, String cedula, Ciudad ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", Edad: " + edad + ", Cédula: " + cedula + ", Ciudad: " + ciudad.getNombre();
    }
}
