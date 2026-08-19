package lab2progra2;

import lab2progra2.codigo.Banco;
import lab2progra2.codigo.Cliente;
import lab2progra2.codigo.CuentaAhorro;
import lab2progra2.codigo.CuentaMonetaria;
import lab2progra2.codigo.Empleado;
import lab2progra2.codigo.Prestamo;

public class Lab2Progra2 {

    public static void main(String[] args) {

        Banco banco = new Banco(1, "Banco Nacional", "San Jose, Costa Rica");

        Empleado empleado1 = new Empleado("E001", "Ana Lopez");
        Empleado empleado2 = new Empleado("E002", "Carlos Mora");
        banco.agregarEmpleado(empleado1);
        banco.agregarEmpleado(empleado2);

        Cliente cliente1 = new Cliente("Maria Rodriguez", "C001", "Heredia", "8888-1111");
        Cliente cliente2 = new Cliente("Pedro Solano", "C002", "Alajuela", "8888-2222");
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        System.out.println("el banco nacional ya tiene " + banco.getEmpleados().size()
                + " empleados y " + banco.getClientes().size() + " clientes");

        CuentaAhorro ahorro = new CuentaAhorro(1, "AH-0001", 1000.0, "01/01/2026", "Activa", 3.5);
        CuentaMonetaria monetaria = new CuentaMonetaria(2, "MO-0001", 500.0, "15/01/2026", "Activa", 300.0);
        cliente1.abrirCuenta(ahorro);
        cliente1.abrirCuenta(monetaria);

        cliente1.depositar(ahorro, 200.0);
        System.out.println("depocite 200 en la de ahorro y el saldo quedo en " + ahorro.getSaldo());

        cliente1.retirar(monetaria, 700.0);
        System.out.println("retire 700 de la monetaria y con el sobregiro quedo en " + monetaria.getSaldo());

        cliente1.retirar(monetaria, 200.0);
        System.out.println("le quise quitar 200 mas pero ya paso el limite y el saldo sigue en " + monetaria.getSaldo());

        cliente1.cerrarCuenta(ahorro);
        cliente1.depositar(ahorro, 500.0);
        System.out.println("depocite en la cuenta cerrada pero no deja y el saldo sigue en " + ahorro.getSaldo());

        Prestamo prestamo = new Prestamo(1, "Personal", 100000.0, 12.0, 24, "01/03/2026", monetaria);
        cliente1.solicitarPrestamo(prestamo);
        System.out.println("maria pidio el prestamo y quedo en " + prestamo.getEstado());

        empleado1.procesarSolicitudPrestamo(prestamo, true);
        System.out.println("ana lo aprobo y aora esta " + prestamo.getEstado());
        System.out.println("la cuota mensual sale en " + prestamo.calcularCuotaMensual());

        prestamo.abonar(prestamo.calcularCuotaMensual());
        System.out.println("ya abone la primera cuota y me queda " + prestamo.getSaldoPendiente());

        empleado1.emitirTarjeta(cliente2);
        System.out.println(empleado1.getNombre() + " es la que trabaja en " + empleado1.getBanco().getNombre());
    }
}
