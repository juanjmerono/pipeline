package org.pipeline.simple;

public class Simple {

	public int suma(int a,int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		Simple s = new Simple();
		System.out.println("Hello, World: " + s.suma(10, 11));
		
	}
	
}
