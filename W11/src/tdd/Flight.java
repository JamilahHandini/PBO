package tdd;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Flight {
	private String id;
    private List<Passenger> passengers = new ArrayList<Passenger>(); //list array untuk menampung para penumpang
    private String flightType;
    
    public Flight(String id, String flightType) { //constructor class flight
        this.id = id;
        this.flightType = flightType;
    }
    
    public String getId() { //getter id
        return id;
    }

    public List<Passenger> getPassengersList() {    //getter list penumpang
        return Collections.unmodifiableList(passengers);
    }

    public String getFlightType() { //getter tipe penerbangan berupa string
        return flightType;
    } 
    
    public boolean addPassenger(Passenger passenger) { //method untuk menambahkan penumpang
        switch (flightType) {                          //berdasarkan tipe penerbangan dan status vip nya 
            case "Economy":
                return passengers.add(passenger);
            case "Business":
                if (passenger.isVip()) {
                    return passengers.add(passenger);
                }
                return false;
            default:
        throw new RuntimeException("Unknown type: " + flightType); //handling jika terdapat error saat runtime
        }
    }
    
    public boolean removePassenger(Passenger passenger) {   //method untuk menghapus penumpang 
        switch (flightType) {                               //dengan mempertimbangkan tipe penerbangan dan status vip
            case "Economy":
                if (!passenger.isVip()) {
                    return passengers.remove(passenger);
                }
                return false;
            case "Business":
                return false;
            default:
        throw new RuntimeException("Unknown type: " + flightType);  //handling jika terdapat error saat runtime
        }
    }
}
