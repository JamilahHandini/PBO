package test;

public class BusinessFlight extends Flight{
	public BusinessFlight(String id) {      //setter id
        super(id);
    }

    @Override       //override dari super class flight (polymorfism)
    public boolean addPassenger(Passenger passenger) {  //method tambah penumpang
        if (passenger.isVip()) {
            return passengers.add(passenger);
        }
        return false;
    }

    @Override       //override dari super class flight (polymorfism)
    public boolean removePassenger(Passenger passenger) {   //method hapus penumpang
        return false;
    } 
}
