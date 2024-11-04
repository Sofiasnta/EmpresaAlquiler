package co.edu.uniquindio.poo.model;

public class Camioneta extends  Vehiculo {

    private int tarifaBase;
    private int capacidadCarga;
    private int porcentajeExtra;

    public Camioneta (String numeroMatricula, String marca, String modelo, String anioFabricacion, int capacidadCarga){
        super(numeroMatricula, marca, modelo, anioFabricacion);
        this.tarifaBase = 30000;
        this.capacidadCarga = capacidadCarga;
        this.porcentajeExtra = 2000;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int calcularCostoReserva(Reserva reserva){
        if (reserva.getDiasAlquiler()>0) {
            int costoReserva = reserva.getDiasAlquiler() * tarifaBase;
            double costoExtra = costoReserva *(porcentajeExtra / 100) * capacidadCarga;
            costoReserva += costoExtra; // Agregar el costo extra
            return (int) costoReserva; // Retornar el costo total como un entero
        } else {
            System.out.println("Los días de alquiler no son mayores a cero");
            return 0; // Indicar error
        }
    }


    public String toString() {
        return "Camioneta" + super.toString() + "[capacidadCarga = " + capacidadCarga + "]";
    }

}
