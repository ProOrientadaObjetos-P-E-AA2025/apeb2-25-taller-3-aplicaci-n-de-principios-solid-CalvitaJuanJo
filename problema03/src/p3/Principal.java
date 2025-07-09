package p3;

import p1.*;
import p2.TipoMatricula;

public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();

        MatriculaCampamento mcamp = new MatriculaCampamento();
        MatriculaColegio mcolegio = new MatriculaColegio();
        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();

        tipos.agregarMatricula(mcamp);
        tipos.agregarMatricula(mcolegio);
        tipos.agregarMatricula(mescuela);
        tipos.agregarMatricula(mjardin);
        tipos.agregarMatricula(mmaternal);
        tipos.agregarMatricula(mmaternal2);

        tipos.establecerPromedioTarifas();

        System.out.println(tipos);
    }
}