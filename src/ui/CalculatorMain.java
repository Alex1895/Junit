package ui;
import java.util.Scanner;

import operationsHandler.OperationHandler;


/**
 * 
 * @author TrainingLap
 * This class will be the starting point for our application
 * -> this class will contain the option menu 
 */
public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		OperationHandler handler = null;
		String opt = "";
		
		do{
			System.out.println("\nOption Menu");
			System.out.println("1) Calculator [Basic Operations]");
			System.out.println("2) Integer Reverse");
			System.out.println("3) Factorial");
			System.out.println("0) Quit");
			opt = scanner.nextLine();
			switch(opt){
			case "1":
				//calculator basic operations
				String expression = "";
				System.out.println("\nIntrodusca la operacion a realizar: ");
				expression = scanner.nextLine();
				handler = new OperationHandler();
				handler.operation();
				break;
			case "2":
				int num=0;
				System.out.println("\nIntrodusca el entero a invertir: ");
				num = scanner.nextInt();
				handler = new OperationHandler();
				handler.reversedInteger(num);
				scanner.nextLine();
				break;
			case "3":
				System.out.println("\nIntrodusca el numero a factorizar: ");
				num = scanner.nextInt();
				handler = new OperationHandler();
				handler.getFactorial(num);
				scanner.nextLine();
				break;
			case "0":
				System.out.println("\nEjecucion Finalizada");
				break;
			default:
				System.out.println("\nOpcion no valida");
				break;
			}	
			
		}while(!opt.equals("0"));
		scanner.close();
	}
}
