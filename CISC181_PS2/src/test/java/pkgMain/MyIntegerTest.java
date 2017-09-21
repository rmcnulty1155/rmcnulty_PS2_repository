package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void testEven() {
		MyInteger myInt = new MyInteger(8);
		assertTrue(myInt.isEven());
	}
	
	@Test
	public void testOdd() {
		MyInteger myInt = new MyInteger(21);
		assertTrue(myInt.isOdd());
	}
	
	@Test
	public void testPrime() {
		MyInteger myInt = new MyInteger(19);
		assertTrue(myInt.isPrime());
	}
	
//---------------------
	
	@Test
	public void testEven2() {
		assertTrue(MyInteger.isEven(44));
	}
	
	@Test
	public void testOdd2() {
		assertTrue(MyInteger.isOdd(67));
	}
	
	@Test
	public void testPrime2() {
		assertTrue(MyInteger.isPrime(79));
	}
	
	// ---------------
	
	@Test
	public void testEven3() {
		MyInteger myInt = new MyInteger(18);
		assertTrue(myInt.isEven(myInt));
	}
	
	@Test
	public void testOdd3() {
		MyInteger myInt = new MyInteger(33);
		assertTrue(myInt.isOdd(myInt));
	}
	
	@Test
	public void testPrime3() {
		MyInteger myInt = new MyInteger(2);
		assertTrue(myInt.isPrime(myInt));
	}
	
	// ---------------
	
	@Test
	public void testEquals() {
		MyInteger myInt = new MyInteger(103);
		assertTrue(myInt.isEquals(103));
	}
	
	@Test
	public void testEquals2() {
		MyInteger myInt = new MyInteger(103);
		assertTrue(myInt.isEquals(myInt));
	}
	
}
