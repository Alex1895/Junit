package operations;

public class Divition extends Operation {

	@Override
	public void performOperation(double num1, double num2) {
		
		System.out.println("The resoult by dividing "+num1 +" / "+ num2 + " = "+ divition(num1,num2));
	}
	private double divition(double num1, double num2){
		double result = num1 / num2;
		return result;
	}
}
