package telran.numbers;

import static org.junit.jupiter.api.Assertions.*;
import static telran.numbers.Calculator.*; 

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		assertEquals(4.0, sum(2, 2));
		assertEquals(0, sum(2, -2)); 
		assertEquals(-2.5, sum(2, -4.5));
	}

	@Test
	void testSubtract() {
		assertEquals(0, subtract(2, 2));
		assertEquals(4.0, subtract(2, -2)); 
		assertEquals(6.5, subtract(2, -4.5));
	}

	@Test
	void testMultyply() {
		assertEquals(4, multiply(2, 2));
		assertEquals(-4, multiply(2, -2)); 
		assertEquals(-4, multiply(2, -2));
	}

	@Test
	void testDivide() {
		assertEquals(2.5, divide(5, 2));
		assertEquals(Double.NEGATIVE_INFINITY, divide(-5, 0)); 
		assertEquals(Double.POSITIVE_INFINITY, divide(5, 0));
		assertEquals(-2.5,divide(-5, 2));
		assertEquals(2.5,divide(-5, -2.0));

		
	}
	

}
