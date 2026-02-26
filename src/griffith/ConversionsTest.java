package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {
	
	//First test method that should fail
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

}
