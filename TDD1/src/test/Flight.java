package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Flight {
	private String id;
    List<Passenger> passengers = new ArrayList<Passenger>();

    public Flight(String id) {  //setter id
        this.id = id;
    }

    public String getId() { //getter id
        return id;
    }

    public List<Passenger> getPassengersList() {            
        return Collections.unmodifiableList(passengers);    //getter passenger list
    }

    public abstract boolean addPassenger(Passenger passenger);      //method abstract 
    public abstract boolean removePassenger(Passenger passenger);   //method abstract
}
