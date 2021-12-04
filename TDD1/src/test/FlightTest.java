package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlightTest {

	@Test
	public void testPrintData() {
		Flight economyFlight = new EconomyFlight("1");  //instansi objek penerbangan (ekonomi)
        Flight businessFlight = new BusinessFlight("2");    //instansi objek penerbangan (bisnis)
		
		//cek tipe id
		assertEquals("1",economyFlight.getId());//nama id businessFlight
		assertEquals("2",businessFlight.getId());//nama id economyFlight
	}

}
