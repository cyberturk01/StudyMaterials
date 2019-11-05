package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JunitTestingTest {
	static JunitTesting test= new JunitTesting();
	@Test
	void testSquare() {
		int actualResult=test.square(3);
		assertEquals(9, actualResult);
	}

	
	@Test
	@DisplayName("Testing Count A:")
	void testCountA() {
		int actualResult=test.countA("Halemalevildan");
		assertEquals(3, actualResult);
	}

	@Test
	void testConcatenate() {
		String actualResult=test.concatenate("one", "two");
		assertEquals("onetwo", actualResult);
	}

}
