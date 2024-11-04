package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo {
    private int numeroPuertas;
    private int tarifaBase;

    public Auto(String numeroMatricula, String marca, String modelo, String anioFabricacion, int numeroPuertas) {
        super(numeroMatricula, marca, modelo, anioFabricacion);
        this.numeroPuertas = numeroPuertas;
        this.tarifaBase = 20000;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int calcularCostoReserva (Reserva reserva) {
        if (reserva.getDiasAlquiler() > 0) {
            int costoReserva = reserva.getDiasAlquiler() * tarifaBase;
            return costoReserva;
        } else System.out.println("Los dias de alquiler no son mayores a cero");
        return 0;
    }

    public String toString() {
        return "auto" + super.toString() + "[numeroPuertas = " + numeroPuertas + "]";
    }

}
