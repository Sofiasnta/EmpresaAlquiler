package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {

    private int tarifaBase;
    private TipoTransmision tipoTransmision;

    public Moto (String numeroMatricula, String marca, String modelo, String anioFabricacion, TipoTransmision tipoTransmision){
        super(numeroMatricula, marca, modelo, anioFabricacion);
        this.tarifaBase = 10000;
        this.tipoTransmision = tipoTransmision;
    }

    public int getTarifaBase() {
        return tarifaBase;
    }



    public void setTarifaBase(int tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    

    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }


    public int calcularCostoReserva(Reserva reserva){
        int costoReserva = 0;
        if (getTipoTransmision() == tipoTransmision.MANUAL) {
             costoReserva = reserva.getDiasAlquiler() * tarifaBase;
            return costoReserva;
        } else if (getTipoTransmision() == tipoTransmision.AUTOMATICA) {
            costoReserva = reserva.getDiasAlquiler() * tarifaBase;
            int tarifaAdicionarReserva = costoReserva + 2000;
            return tarifaAdicionarReserva;
            
        }  
        
        System.out.println("Tipo de transmisión no válido");
        return 0; // O algún otro valor que indique un error

    }
        
    

    public String toString() {
        return "moto" + super.toString() + "[tipoTransmision = " + tipoTransmision + "]";
    }



}
