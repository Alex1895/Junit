package CalculatorTest;

import static org.junit.Assert.*;

import operations.Divition;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DivitionTest {

	Divition operation;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
		operation = new Divition();

		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}


	@Test
	public void divideWitIntegersTest() {
		double v1 = 5;
		double v2 = 3;

		operation.performOperation(v1, v2);

		String expected = "The resoult by dividing " + v1 + " / " + v2 + " = " + (v1 / v2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void divideByZeroTest() {
		double v1 = 12;
		double v2 = 0;

		operation.performOperation(v1, v2);

		String expected = "The resoult by dividing " + v1 + " / " + v2 + " = " + (v1 / v2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	
	
	@Test
	public void divideWithBothValuesInZeroTest() {
		double v1 = 0;
		double v2 = 0;

		operation.performOperation(v1, v2);

		String expected = "The resoult by dividing " + v1 + " / " + v2 + " = " + (v1 / v2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	
	
	@Test
	public void divideWitNegativeNumbersTest() {
		double v1 = -55544.22;
		double v2 = -35.25555;

		operation.performOperation(v1, v2);

		String expected = "The resoult by dividing " + v1 + " / " + v2 + " = " + (v1 / v2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

}
