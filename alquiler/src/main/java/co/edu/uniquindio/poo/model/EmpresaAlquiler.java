package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class EmpresaAlquiler {
    private String nombre;
    private Collection<Vehiculo> vehiculos;
    private Collection<Cliente> clientes;
    private Collection<Reserva> reservas;

    public EmpresaAlquiler (String nombre){
        this.nombre = nombre;
        vehiculos = new LinkedList<>();
        clientes = new LinkedList<>();
        reservas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }


    public boolean verificarCliente (String cedula) {
        for (Cliente cliente : clientes) {
            if (cedula.equals(cliente.getCedula())) {
                return false;
            }
        }
        return true;

    }

    public void agrgarCliente (Cliente cliente) {
        boolean esUnico = verificarCliente(cliente.getCedula());
        if (esUnico) {
            clientes.add(cliente);
        } else {
            System.out.println("El cliente ya existe");
        }
    }


    public void eliminarCliente (String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                clientes.remove(cliente);
                break;
            }
        }
    }

    public boolean verificarVehiculo (String numeroMatricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (numeroMatricula.equals(vehiculo.getNumeroMatricula())) {
                return false;
            }
        }
        return true;

    }

    public void agregarVehiculo (Vehiculo vehiculo) {
        boolean esUnico = verificarVehiculo(vehiculo.getNumeroMatricula());
        if (esUnico) {
            vehiculos.add(vehiculo);
        } else {
            System.out.println("El vehiculo ya existe");
        }
    }


    public void eliminarVehiculo (String numeroMatricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNumeroMatricula().equals(numeroMatricula)) {
                vehiculos.remove(vehiculo);
                break;
            }
        }
    }


    public boolean verificarReserva (String codigoAlquiler) {
        for (Reserva reserva : reservas) {
            if (codigoAlquiler.equals(reserva.getCodigoAlquiler())) {
                return false;
            }
        }
        return true;

    }

    public void agregarReserva (Reserva reserva) {
        boolean esUnico = verificarReserva(reserva.getCodigoAlquiler());
        if (esUnico) {
            reservas.add(reserva);
        } else {
            System.out.println("La reserva ya existe");
        }
    }


    public void eliminarReserva (String codigoAlquiler) {
        for (Reserva reserva : reservas) {
            if (reserva.getCodigoAlquiler().equals(codigoAlquiler)) {
                reservas.remove(reserva);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "EmpresaAlquiler [nombre=" + nombre + ", vehiculos=" + vehiculos + "]";
    }

    

 
    
}
