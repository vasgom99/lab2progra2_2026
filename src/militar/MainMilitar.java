package militar;

import java.time.LocalDate;

public class MainMilitar {

    public static void main(String[] args) {

        CuerpoEjercito infanteria = new CuerpoEjercito("Infanteria", "Infanteria de Linea");
        CuerpoEjercito artilleria = new CuerpoEjercito("Artilleria", "Artilleria Pesada");

        Cuartel cuartel1 = new Cuartel(1, "Cuartel Central", "Zona 5");
        Cuartel cuartel2 = new Cuartel(2, "Cuartel Norte", "Zona 12");

        Compania comp1 = new Compania(101, "patrullaje");
        Compania comp2 = new Compania(102, "vigilancia");

        cuartel1.agregarCompania(comp1);
        cuartel1.agregarCompania(comp2);
        cuartel2.agregarCompania(comp1);

        System.out.println("la compania 101 esta ubicada en " + comp1.getCuarteles().size() + " cuarteles");

        Soldado s1 = new Soldado("S001", "Juan Diaz", "cabo", "Zona 5");
        s1.asignarCuartel(cuartel1);
        s1.asignarCuerpo(infanteria);
        s1.asignarCompania(comp1);

        Soldado s2 = new Soldado("S002", "Carlos Rios", "soldado raso", "Zona 12");
        s2.asignarCuartel(cuartel2);
        s2.asignarCuerpo(artilleria);
        s2.asignarCompania(comp1);

        System.out.println("el soldado " + s1.getNombre() + " es del cuerpo " + s1.getCuerpo().getTipoCuerpo()
                + " y pertenece a la compania " + s1.getCompania().getIdCompania());
        System.out.println("s1 y s2 son de la misma compania pero en cuarteles distintos? "
                + (s1.getCuartel() != s2.getCuartel()));

        Servicios guardia = new Servicios("SV-1", "guardia");
        Servicios imaginaria = new Servicios("SV-2", "imaginaria");

        s1.realizarServicio(guardia, LocalDate.parse("2026-07-01"));
        s1.realizarServicio(imaginaria, LocalDate.parse("2026-07-03"));
        s2.realizarServicio(guardia, LocalDate.parse("2026-07-02"));

        System.out.println("el soldado " + s1.getNombre() + " ha realizado " + s1.getServiciosRealizados().size() + " servicios");
        System.out.println("el servicio de guardia lo realizaron " + guardia.getDetalles().size() + " soldados");
        System.out.println("la fecha del primer servicio de juan fue " + s1.getServiciosRealizados().get(0).getFechaRealizado());
    }
}