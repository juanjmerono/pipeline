package org.pipeline.simple;

import org.junit.Test;

public class SimpleTest {

	private Simple testSimple = new Simple();
	
	@Test
	public void testSuma() {
		assert 21 == testSimple.suma(10,11); 
	}

	@Test
	public void testOtraSuma() {
		assert 2 == testSimple.suma(0,1); 
	}
	
	
}
