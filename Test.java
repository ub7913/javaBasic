/*public class VariableExample {
	
	public static void main(String[] args) {
	    byte b1, b2; 
        b1 = 10;
        b2 = 20;
		byte result = b1 + b2; -> 바이트 두개가 더해지면 인트로 값이 변함, 그래서 데이터 타입을 변경해줘야 함
		System.out.println("result => " + result);
	}
}*/

public class Test {
	
	public static void main(String[] args) {
	    byte b1, b2; 
        b1 = 10;
        b2 = 20;
		int result = b1 + b2;
		System.out.println("result => " + result);
	}
}