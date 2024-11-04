package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;


public class Reserva {
    private String codigoAlquiler;
    private int diasAlquiler;
    private Collection<Cliente> clientes;
    private Vehiculo vehiculo;

    public Reserva (String codigoAlquiler, int diasAlquiler, Vehiculo vehiculo){
        this.codigoAlquiler = codigoAlquiler;
        this.diasAlquiler = diasAlquiler;
        clientes = new LinkedList<>();
        this.vehiculo = vehiculo;
    }

    public String getCodigoAlquiler() {
        return codigoAlquiler;
    }

    public void setCodigoAlquiler(String codigoAlquiler) {
        this.codigoAlquiler = codigoAlquiler;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }


    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

  //  public int calcularCostoReserva() {
    //    return vehiculo.calcularCostoReserva(diasAlquiler); // Llama al método en Vehiculo
    //}

    
}
