
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1; // 실수를 나타냄
		double b = 12345;  // 실수코드에 정수를 넣어도 정수 뒤에는 소수점이 절대값인'0'이기 때문에 오류 발생하지 않음.
		double b2 = (double)1; // b 와 b2는 같음.
		System.out.println(b);
		
		// int c = 1.1; // 정수코드에 실수를 입력하면 오류가 생김. 소수점은 안됨.
		double d = 1.1; // 실수코드 = 실수 O
		int e = (int) 1.1; // (int)=> 실수를 억지로 정수로 변환을 시키고 소수점은 반올림도 안되고 날라가버림.
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);  // 1 이라는 '숫자'를 '문자열'로 변환시킴
		System.out.println(f);
		System.out.println(f+123);
		//System.out.println(f*123); // 문자열로 인식되어 더하기를 제외한 연산이 불가.

	}

}
