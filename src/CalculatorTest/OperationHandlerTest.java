package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import operations.Divition;
import operationsHandler.OperationHandler;

public class OperationHandlerTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {

		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@Test
	public void addOperationTest() {

		double v1 = 5;
		double v2 = 4;

		OperationHandler operHandler = new OperationHandler(v1 + "+" + v2);

		String expected = "The resoult by adding " + v1 + " + " + v2 + " = " + (v1 + v2) + "\r\n";

		operHandler.operation();
		assertEquals(expected, outContent.toString());
	}
	
	
	@Test
	public void divitionOperationTest() {

		double v1 = 5;
		double v2 = 4;

		OperationHandler operHandler = new OperationHandler(v1 + "/" + v2);

		String expected = "The resoult by dividing " + v1 + " / " + v2 + " = " + (v1 / v2) + "\r\n";

		operHandler.operation();
		assertEquals(expected, outContent.toString());
	}
	
	
	@Test
	public void divideOperationWithOtherSymbolTest() {

		double v1 = 5;
		double v2 = 4;

		OperationHandler operHandler = new OperationHandler(v1 + "%" + v2);

		String expected = "The resoult by dividing " + v1 + " / " + v2 + " = " + (v1 / v2) + "\r\n";

		operHandler.operation();
		assertEquals(expected, outContent.toString());
	}
	
	
	@Test
	public void OperationWithOnlyOneNumberTest() {

		double v1 = 5;

		OperationHandler operHandler = new OperationHandler(v1 + "+");
		operHandler.operation();

	}


	@After
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

}
