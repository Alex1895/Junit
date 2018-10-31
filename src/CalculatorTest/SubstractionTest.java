package CalculatorTest;

import static org.junit.Assert.*;
import operations.Substraction;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SubstractionTest {
	private Substraction operation;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
		operation = new Substraction();

		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	@Test
	public void substractionWitIntegersTest() {
		double v1 = 5;
		double v2 = 2;

		operation.performOperation(v1, v2);

		String expected = "The resoult by substracting " + v1 + " - " + v2 + " = " + (v1 - v2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	@Test
	public void substractionWithDecimalsTest() {

		double v1 = 5.3333;
		double v2 = 3.1111;

		operation.performOperation(v1, v2);

		String expected = "The resoult by substracting " + v1 + " - " + v2 + " = " + (v1 - v2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	@Test
	public void substractionOnlyWithNegativeNumbersTest() {

		double v1 = -150;
		double v2 = -98;

		operation.performOperation(v1, v2);

		String expected = "The resoult by substracting " + v1 + " - " + v2 + " = " + (v1 - v2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	@After
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}
}
