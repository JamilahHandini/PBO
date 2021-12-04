package tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;


class AirportTest {

	@DisplayName("Given there is an economy flight")                            //melabeli class uji
    @Nested                                                                     //class uji bersarang
    class EconomyFlightTest {                                                   //test class penerbangan ekonomi
        private Flight economyFlight;
        @BeforeEach 

        void setUp() {
            economyFlight = new Flight("1", "Economy");                         //inisialisasi class
        }
        
        @Test
        public void testEconomyFlightRegularPassenger() {                       //assertEquals = unit testing untuk menyamakan nilai dari ekspektasi dengan hasil nyata 
            Passenger mike = new Passenger("Mike", false);                      //instansi objek penumpang non VIP 
            assertEquals("1", economyFlight.getId());                           //cek id Mike apa ada pada daftar penumpang penerbangan ekonomi.
            assertEquals(true, economyFlight.addPassenger(mike));               //cek Mike berhasil dimasikkan dalam daftar penumpang penerbangan ekonomi
            assertEquals(1, economyFlight.getPassengersList().size());          //cek jumlah penumpang pada penerbangan ekonomi = 1
            assertEquals("Mike",                                                //cek keberadaan Mike dalam daftar penumpang penerbangan ekonomi
            economyFlight.getPassengersList().get(0).getName());    
            assertEquals(true, economyFlight.removePassenger(mike));            // cek Mike berhasil dihapus dari daftar penumpang penerbangan ekonomi
            assertEquals(0, economyFlight.getPassengersList().size());          //cek jumlah penumpang pada penerbangan ekonomi = 0 (kosong)
        }
        
        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger james = new Passenger("James", true);                     //instansi objek penumpang VIP
            assertEquals("1", economyFlight.getId());                           //cek id James apa ada pada daftar penumpang penerbangan ekonomi
            assertEquals(true, economyFlight.addPassenger(james));              //cek James berhasil dimasikkan dalam daftar penumpang penerbangan ekonomi
            assertEquals(1, economyFlight.getPassengersList().size());          //cek jumlah penumpang pada penerbangan ekonomi = 1
            assertEquals("James",                                               //cek keberadaan Mike dalam daftar penumpang penerbangan ekonomi
            economyFlight.getPassengersList().get(0).getName());
            assertEquals(false, economyFlight.removePassenger(james));          // cek James tidak berhasil dihapus dari daftar penumpang penerbangan ekonomi
            assertEquals(1, economyFlight.getPassengersList().size());          //cek jumlah penumpang pada penerbangan ekonomi = 1
        }     
    }
    
    @DisplayName("Given there is a business flight")                            //melabeli class uji
    @Nested                                                                     //class uji bersarang
    class BusinessFlightTest {                                                  //test class penerbangan ekonomi
        private Flight businessFlight;
        @BeforeEach

        void setUp() {
            businessFlight = new Flight("2", "Business");                       //inisialisasi class
        }

        @Test
        public void testBusinessFlightRegularPassenger() {  
            Passenger mike = new Passenger("Mike", false);                      //instansi objek penumpang non VIP
            assertEquals(false, businessFlight.addPassenger(mike));             //cek Mike tidak berhasil dimasikkan dalam daftar penumpang penerbangan bisnis
            assertEquals(0, businessFlight.getPassengersList().size());         //cek jumlah penumpang pada penerbangan bisnis = 0 (kosong)
            assertEquals(false, businessFlight.removePassenger(mike));          //cek Mike tidak berhasil dihapus dari daftar penumpang penerbangan bisnis
            assertEquals(0, businessFlight.getPassengersList().size());         //cek jumlah penumpang pada penerbangan bisnis = 0 (kosong)
        }

        @Test
        public void testBusinessFlightVipPassenger() {                          
            Passenger james = new Passenger("James", true);                     //instansi objek penumpang VIP
            assertEquals(true, businessFlight.addPassenger(james));             //cek James berhasil dimasikkan dalam daftar penumpang penerbangan bisnis
            assertEquals(1, businessFlight.getPassengersList().size());         //cek jumlah penumpang pada penerbangan bisnis = 1 
            assertEquals(false, businessFlight.removePassenger(james));         //cek James tidak berhasil dihapus dari daftar penumpang penerbangan bisnis
            assertEquals(1, businessFlight.getPassengersList().size());         //cek jumlah penumpang pada penerbangan bisnis = 1 
        }
    }

}
