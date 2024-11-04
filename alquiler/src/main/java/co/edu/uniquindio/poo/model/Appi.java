package co.edu.uniquindio.poo.model;

public class Appi {
    public static void main(String[] args) {
        EmpresaAlquiler empresa = new EmpresaAlquiler("Alquiler de Vehículos ");

        Moto moto = new Moto("1", "Yamaha", "2020", "2020", TipoTransmision.MANUAL);
        Auto auto = new Auto("2", "Mazda", "2021", "2021", 4);
        Camioneta camioneta = new Camioneta("3", "KIA", "2021", "2021", 10);

        empresa.agregarVehiculo(moto);
        empresa.agregarVehiculo(camioneta);
        empresa.agregarVehiculo(auto);

        Cliente cliente = new Cliente("Sofia", 18, "123");
        Cliente cliente1 = new Cliente("Sara", 16, "1234");

        empresa.agrgarCliente(cliente);
        empresa.agrgarCliente(cliente1);

        Reserva reserva = new Reserva("11", 2, camioneta);
        Reserva reserva1 = new Reserva("22", 5, moto);

        empresa.agregarReserva(reserva1);
        empresa.agregarReserva(reserva);

        System.out.println(moto.calcularCostoReserva(reserva1));
        System.out.println(camioneta.calcularCostoReserva(reserva));

    }
}