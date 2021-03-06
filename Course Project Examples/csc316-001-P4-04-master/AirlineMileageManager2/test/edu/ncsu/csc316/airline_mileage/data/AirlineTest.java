package edu.ncsu.csc316.airline_mileage.data;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests Airline class
 * @author Aasiyah Feisal (anfeisal)
 *
 */
public class AirlineTest {

	/**
	 * Tests methods for Airline class
	 */
	@Test
	public void testAirline() {
		Airline delta = new Airline("Delta Air Lines", "DL", "DELTA", "United States");
		assertEquals(delta.getName(), "Delta Air Lines");
		assertEquals(delta.getCallSign(), "DELTA");
		assertEquals(delta.getCode(), "DL");
		assertEquals(delta.getCountry(), "United States");
	}

}
