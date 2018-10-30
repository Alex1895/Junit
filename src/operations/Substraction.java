package operations;

public class Substraction extends Operation {

	@Override
	public void performOperation(double num1, double num2) {
		
		System.out.println("The resoult by substracting "+num1 +" - "+ num2 + " = "+ substraction(num1,num2));	
	}
	private double substraction(double num1, double num2){
		double result = num1 - num2;
		return result;
	}
}
