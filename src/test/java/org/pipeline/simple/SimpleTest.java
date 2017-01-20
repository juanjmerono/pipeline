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
		assert 1 == testSimple.suma(0,1); 
	}
	
	@Test
	public void testResta() {
		assert 9 == testSimple.suma(10,-1); 
	}
	
	@Test
	public void testMore() {
		assert 19 == testSimple.suma(20,-1); 
	}

	@Test
	public void testFail() {
		assert 29 == testSimple.suma(20,9); 
	}
	
}
