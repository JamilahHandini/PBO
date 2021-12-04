package test;

public class EconomyFlight extends Flight{
	public EconomyFlight(String id) {
        super(id);                          //set id untuk economyFlight
    }
    
    @Override       //override dari super class flight (polymorfism)
    public boolean addPassenger(Passenger passenger) {      //method tambah penumpang
        return passengers.add(passenger);
    }

    @Override       //override dari super class flight (polymorfism)
    public boolean removePassenger(Passenger passenger) {   //method hapus penumpang
        if (!passenger.isVip()) {
            return passengers.remove(passenger);
        }
        return false;
    }
}
