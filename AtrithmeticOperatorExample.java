
public class AtrithmeticOperatorExample {
	public static void main (String[] args) {
		int num1 = 10, num2 = 4;
		
		int result = num1 / num2;
		System.out.println("result : " + result);
		
		result = num1 % num2;
		System.out.println("result: " + result);
		
		int num3 = 123;
		if (num3 % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}	
	}
}
