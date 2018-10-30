package operations;

public class RecursiveFactorial {
	private int num=0;
	public RecursiveFactorial(int num) {
		this.num = num;
	}
	public void getFactorial(){
		int factorial = 0;
		System.out.println("<< Buscando Factorial >>");
		for(int i=0; i <= num; i++){
			factorial = calculateFactorial(i);
			System.out.println("-> "+ factorial);
		}
		System.out.println("Factorial Encontrado<< "+ factorial +" >>");
	}
	private int calculateFactorial(int num){
		if(num <= 1){
			return num;
		}else{
			return calculateFactorial(num-1)*num;
		}
	}
	
}
