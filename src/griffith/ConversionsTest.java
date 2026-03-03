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
	
	//Second test to convert from dollar to euro method that should succeed
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
	
	//Third test to convert from string to integer method that should succeed
	@Test
	public void testStringToInteger() {
	    Conversions conv = new Conversions();

	    // Test positive string
	    assertEquals(123, conv.stringToInteger("123"));

	    // Test negative string
	    assertEquals(-50, conv.stringToInteger("-50"));

	    // Test string 0
	    assertEquals(0, conv.stringToInteger("0"));

	    // Test string with non-numeric characters
	    assertEquals(0, conv.stringToInteger(null));
	    assertEquals(0, conv.stringToInteger(""));
	}
	
	//Fourth test to convert from integer to string method that should fail first
	@Test
	public void testIntegerToString() {
	    Conversions conv = new Conversions();

	    // Test positive
	    assertEquals("500", conv.integerToString(500));

	    // Test negative
	    assertEquals("-10", conv.integerToString(-10));

	    // Test 0
	    assertEquals("0", conv.integerToString(0));
	}
}
