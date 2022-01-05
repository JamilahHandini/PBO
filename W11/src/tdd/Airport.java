package tdd;


public class Airport {
	public static void main(String[] args) {

        Flight economyFlight = new Flight("1", "Economy");  //instansi objek penerbangan (ekonomi)
        Flight businessFlight = new Flight("2", "Business");    //instansi objek penerbangan (bisnis)

        Passenger james = new Passenger("James", true); //instansi objek penumpang VIP bernama James 
        Passenger mike = new Passenger("Mike", false);  //instansi objek penumpang non VIP bernama Mike

        businessFlight.addPassenger(james);             //James akan ditambahkan ke dalam daftar penumpang penerbangan bisnis
        businessFlight.removePassenger(james);          //James akan dihapuskan dari daftar penumpang penerbangan bisnis
        businessFlight.addPassenger(mike);              //Mike akan ditambahkan ke dalam daftar penumpang penerbangan bisnis
        economyFlight.addPassenger(mike);               //Mike akan dihapuskan dari daftar penumpang penerbangan ekonomi

        System.out.println("Business flight passengers list:"); //menampilakan daftar penumpang penerbangan bisnis
            for (Passenger passenger: businessFlight.getPassengersList()) {
                System.out.println(passenger.getName());
            }

        System.out.println("Economy flight passengers list:");  //menampilkan daftar penumpang penerbangan ekonomi
            for (Passenger passenger: economyFlight.getPassengersList()) {
                System.out.println(passenger.getName());
            }
    }
}
