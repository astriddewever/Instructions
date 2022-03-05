package instructions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MachineTest {

	@Test
	void test() {
		
		
		LoadConstant lc1 = new LoadConstant(2, 1);
		LoadConstant lc2 = new LoadConstant(2, 1);
		assertEquals(lc1, lc2);
		assertEquals("LoadConstant(2, 1)", ""+lc1);
	}
	
	

}
