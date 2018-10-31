package operations;

public class Multiplication extends Operation{

	@Override
	public void performOperation(double num1, double num2) {
		
		System.out.println("The resoult by multiplying "+num1 +" * "+ num2 + " = "+ multiplication(num1, num2));	
	}
	private double multiplication(double num1, double num2){
		double result = num1 * num2;
		return result;
	}
}
