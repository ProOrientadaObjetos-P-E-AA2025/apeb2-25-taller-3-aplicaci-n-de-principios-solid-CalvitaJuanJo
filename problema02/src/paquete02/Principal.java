package paquete02;

import java.util.ArrayList;
import paquete01.Gestorventv;
import paquete01.Televisor;

public class Principal {
    
    public static void main(String[] args) {
        Televisor t1 = new Televisor();
        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUNG-21 pulgadas");
        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);

        Gestorventv gestor = new Gestorventv();

        System.out.println("-----------------");
        System.out.printf("Total precio TVs: %.2f\n", gestor.totalPrecioTvs(tvs));
        System.out.println("Marcas vendidas:");
        System.out.println(gestor.listaMarcasVendidas(tvs));
        System.out.printf("Televisor más caro: %.2f\n", gestor.televisorMasCaro(tvs));
    }
}
