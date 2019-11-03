package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CounATest {

	@Test
	public void test() {
		JunitTesting test= new JunitTesting();
		int result=test.countA("What is an Api Gateway");
		assertEquals(5, result);
	}

}
