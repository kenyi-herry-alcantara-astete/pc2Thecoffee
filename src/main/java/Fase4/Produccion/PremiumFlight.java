package Fase4.Produccion;

import Fase4.Produccion.Passenger;

public class PremiumFlight extends Flight {

  // Diseño inicial de la clase PremiumFlight. Pregunta 5
  public PremiumFlight(String id) {
      super(id);
  }

    @Override
    public boolean addPassenger(Passenger passenger) {
      // si pasajero es vip se agrega pasajero al avión
        if (passenger.isVip()) {
            return passengers.add(passenger);
        }
        // si pasajero no es vip no se agrega pasajero al avión
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
      // si pasajero es vip se elimina pasajero del avión
        if (passenger.isVip()) {
            return passengers.remove(passenger);
        }
        // si pasajero no es vip no se puede remover pasajero del avión
        return false;
    }

}

