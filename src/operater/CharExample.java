package operater;

public class CharExample {
	public static void main(String[] args) {
		// +, -, *, /, %, &, |, ^, ~,
		int num1, num2, result;
		num1= 10;
		num2=5;
		
		//result = num2=num1;
		result = num1 * num2; // 할당(대입)연산자 = 
		result = -result;
		System.out.printf("-연산결과: %d\n", result);
		
		result = num1 % 3;
		System.out.printf("연산결과: %d\n", result);
		
		result = num1 & num2;
		System.out.printf("& 연산결과: %d\n", result);
		
		result = num1 | num2;
		System.out.printf("| 연산결과: %d\n", result);
		
		result = num1 ^ num2;
		System.out.printf("^ 연산결과: %d\n", result);
		
		result = ~ num1; // 2진수 => 비트반전 ~ + 1 = 0
		// 3 + (-3) = 0 
		System.out.printf("~ 연산결과: %d\n", result);
		
		// >>, >>>, << (비트연산자)
		result = num1 >> 2;
		System.out.printf(">> 연산결과: %d\n", result);
		
		// && || !
		boolean b1 = false;
		boolean b2 = !b1;
		boolean b3 = b1 || b2;
		System.out.printf("b3 : %s, b2 : %s, b1 : %s", b3, b2, b1);
		
	}

}
