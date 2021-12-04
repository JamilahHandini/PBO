package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




class PassengerTest {

	@Test
	public void testPrintData() {
		Passenger mike = new Passenger("Mike", false);
		Passenger james = new Passenger("James", true);
		
		//cek VIP
		assertFalse(mike.isVip());//bukan VIP
		assertTrue(james.isVip());//VIP
		//cek Nama
		assertEquals("Mike",mike.getName());//nama dari mike
		assertEquals("James",james.getName());//nama dari james
	}

}
