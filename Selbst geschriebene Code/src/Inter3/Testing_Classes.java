package Inter3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Testing_Classes {

	@Test
	void Addition() {
	 Calculator c  = new  Calculator();
	 assertEquals(1, c.add(5, 5));
	 
//	assertEquals(13,  c.add(4, 9));
//	assertTrue(c.add(5, 15)== 20);
	
	
	}

}
