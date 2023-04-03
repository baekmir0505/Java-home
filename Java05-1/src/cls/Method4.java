package cls;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7();
		
		int result = mc7.더하기(3, 3);
		System.out.println(result);
		
		int result1 = mc7.빼기(15, 6);
		System.out.println(result1);
		
		int result2 = mc7.곱하기(1, 7);
		System.out.println(result2);
		
		double result3 = mc7.나누기(8, 2);
		System.out.println(result3);
		
		int result4 = mc7.나머지구하기(5, 2);
		System.out.println(result4);
	}
}
class MyClass7{
	int num;
	
	
	// 더하기 +
	int 더하기(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 빼기 -
	int 빼기(int num1, int num2) {
		int result1 = num1 - num2;
		return result1;
	}
	
	// 곱하기 *
	int 곱하기(int num1, int num2) {
		int result2 = num1 * num2;
		return result2;
	}
	
	// 나누기 /
	double 나누기(int num1, int num2) {
		double result3 = 0.0;
		if(num2 == 0) {
			return result3;
		}else {
			result3 = num1 / num2;
			return result3;
		}
	}
	
	//  % 안쓰고 나머지 구하기 
	int 나머지구하기(int num1, int num2) {
		int result4 = num1-((num1/num2)*num2);
		return result4;
	}
	
}
