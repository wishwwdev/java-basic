package chapter1;

// 데이터 타입
// 자바의 변수는 여러가지의 데이터 형태를 저장 할 수 있음
// 해당 변수에 저장할 수 있는 데이터의 형태를 데이터 타입이라 함
// 데이터 타입 - 기본형 데이터 타입 / 참조형 데이터 타입

// 기본형 데이터 타입
// 실제로 데이터가 저장되는 변수의 타입
// 1. 정수형 데이터 타입
// 2. 실수형 데이터 타입
// 3. 문자형 데이터 타입
// 4. 논리형 데이터 타입
public class DataType {

	public static void main(String[] args) {
		// 정수형 데이터 타입
		// (byte, short, int, long)
		
		// 1. byte
		// 1byte (8bit)의 메모리 저장 공간을 차지함
		// -128 ~ 127
		byte byteVariable1 = 127;
		byte byteVariable2 = -128;
		
		// byte byteVariable3 = 128;
		
		// 2. short
		// 2byte (16bit)의 메모리 공간을 차지함
		// -32,768 ~ 32,767
		short shortVariable1 = 32767;
		short shortVariable2 = -32768;
		
		// short shortVariable3 = 32768;
		
		// 3. int
		// 4byte (32bit)의 메모리 공간을 차지함
		// -2,147,483,648 ~ 2,147,483,647
		int intVariable1 = 2_147_483_647;
		int intVariable2 = -2_147_483_648;
		
		// int intVariable3 = 2_147_483_648;
		
		// 4. long
		// 8byte (64bit)의 메모리 공간을 차지함
		// -2^63 ~ 2^63-1
		// 정수타입의 리터럴의 데이터 타입은 int이기 때문에
		// long 타입의 리터럴을 지정할 땐 데이터 뒤에 L을 붙여야 함
		long longVariable1 = 12_147_483_648L;
		
		// 실수형 데이터 타입
		// 1. float
		// 4byte (32bit)의 메모리 공간을 차지함
		// 1.4*10^-45 ~ 1.4*10^38
		// 실수타입의 리터럴의 데이터 타입은 double이기 때문에
		// float 타입의 리터럴을 지정할 땐 데이터 뒤에 F를 붙여야 함
		// 소수점 6~7 자리에서 오차 발생
		float float1 = 3.14F;
		float float2 = 5.55555555555555555555F;
		System.out.println(float2);

		
		// 2. double
		// 8byte (64bit)의 메모리 공간을 차지함
		// 4.9*10^-324 ~ 1.8*10^308
		// 소수점 15~17 자리에서 오차 발생
		double double1 = 3.14;
		double double2 = 5.55555555555555555555;
		System.out.println(double2);
		
		// 문자형 데이터 타입
		// 1. char
		// 2byte (16bit)의 메모리 공간을 차지함
		// 0 ~ 65,535
		// 문자 및 아스키코드, 유니코드를 사용해서 문자를 표현
		// 문자를 나타낼때는 ''로 묶어서 문자를 표현
		char charVariable1 = 'A';
		char charVariable2 = 65;
		char charVariable3 = '\u0041';
		
		System.out.println(charVariable1);
		System.out.println(charVariable2);
		System.out.println(charVariable3);
		
		// 논리형 데이터 타입
		// 1. boolean
		// 1byte (8bit)의 메모리 공간을 차지함
		// true, false의 두가지 데이터만 가질 수 있음
		boolean booleanVariable = true;
		
		// is**, has**, existed**
		
	}

}
