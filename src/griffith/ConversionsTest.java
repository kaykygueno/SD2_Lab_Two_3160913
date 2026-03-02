package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {
	
	//First test Euro to dollar correctly
	@Test
	public void testEuroToDollar() {
	    Conversions conv = new Conversions();

	    // Test positive
	    assertEquals(1.08, conv.euroToDollar(1.0), 0.01);

	    // Test larger positive
	    assertEquals(108.0, conv.euroToDollar(100.0), 0.01);

	    // Test negative
	    assertEquals(-1.08, conv.euroToDollar(-1.0), 0.01);

	    // Test zero
	    assertEquals(0.0, conv.euroToDollar(0.0), 0.01);
	}
	
	//Second test to convert from dollar to euro method that should fail
	@Test
	public void testDollarToEuro() {
	    Conversions conv = new Conversions();

	    // Test Positive
	    assertEquals(0.93, conv.dollarToEuro(1.0), 0.01);

	    // Test larger positive
	    assertEquals(92.59, conv.dollarToEuro(100.0), 0.01);

	    // Test negative
	    assertEquals(-0.93, conv.dollarToEuro(-1.0), 0.01);
	    
	    // Test zero
	    assertEquals(0.0, conv.dollarToEuro(0.0), 0.01);
	}
}
