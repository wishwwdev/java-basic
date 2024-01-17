package chapter3;

class OopTest2 {
	
	int instanceInt;
	int instanceInt2;
	String instanceString;
	
	char[] instanceCharArray;
	
	// 생성자
	// 클래스의 '인스턴스를 생성할 때' 호출되는 메서드
	// 생성자는 클래스의 이름과 동일한 이름을 가지며 반환타입은 존재하지 않음
	
	// 생성자 선언 방법
	// 접근제어자 클래스명(파라미터...) { 인스턴스 생성시 실행할 코드 }
	
	// 인스턴스가 생성될 때 실행할 메서드 역할의 생성자
	OopTest2() {
		// this(10, "aaa");
		System.out.println("OopTest2 인스턴스가 생성됩니다.");
		
	}
	
	// 인스턴스를 초기화하는 역할의 생성자
	OopTest2(int argument1, String argument2){
		// this(매개변수) : 해당 인스턴스의 생성자를 호출하는 키워드
		this();
		instanceInt = argument1;
		instanceString = argument2;
	}

	// 인스턴스를 초기화하는 역할의 생성자
	OopTest2(int instanceInt, String instanceString, int instanceInt2){
		// this : 해당 인스턴스를 지칭하는 키워드
		this.instanceInt = instanceInt;
		this.instanceInt2 = instanceInt2;
		this.instanceString = instanceString;
	}
	
	// 인스턴스를 복사하는 역할의 생성자
	OopTest2(OopTest2 original){
		this();
		instanceInt = original.instanceInt;
		instanceString = original.instanceString;
		
		// 얇은 복사 방법
		// 얇은 복사는 표면적으로 보이는 데이터만 복사함
		// 즉, 인스턴스 변수가 참조형 데이터 타입이라면 주소를 복사해서 넣게 됨
		instanceCharArray = original.instanceCharArray;
		
		// 깊은 복사 방법
		// 깊은 복사는 실제 참조하고 있는 요소의 데이터를 직접 복사함
		// 즉, 인스턴스 변수가 참조형 데이터 타입이라면 해당 인스턴스를 새로 만들고 
		// 그 주소를 참조형 인스턴스 변수에 할당
		char[] copyArray = new char[original.instanceCharArray.length];
		for(int index = 0; index > original.instanceCharArray.length; index++) {
			copyArray[index] = original.instanceCharArray[index];
		}
		instanceCharArray = copyArray;
		
	}
	
	// 오버로딩
	// 같은 이름의 메서드를 여러 개 정의하는 것
	// 메서드의 이름이 같은 상태에서 매개변수의 타입, 갯수, 순서가 다르면 오버로딩 할 수 있음
	static OopTest2 createInstance() {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = 0;
		instance.instanceString = "default";
		return instance;	
	}
	
	static OopTest2 createInstance(int argument1) {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = argument1;
		instance.instanceString = "default";
		return instance;	
	}
	
	static OopTest2 createInstance(int argument1, String argument2) {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = argument1;
		instance.instanceString = argument2;
		return instance;
	}
	
	static OopTest2 createInstance(String argument2, int argument1) {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = argument1;
		instance.instanceString = argument2;
		return instance;
	}
	
	// 반환 타입과 매개변수의 변수명은 오버로딩에 영향을 미치지 않음
//	void overloadMethod(int augument1, int argument2) {
//		
//	}
//
//	int overloadMethod(int augument2, int argument1) {
//		return 0;
//	}
	
}

public class Oop2 {
	
	// 기본형 데이터타입의 매개변수를 받는 메서드
	// 기본형 데이터타입의 매개변수는 값을 직접 복사해서 받기 때문에
	// 호출부에서는 영향을 받지 않음
	static void basicParameterMethod(int argument) {				// 단순히 숫자를 담고 있는 인스턴스를 넣어서 
		argument = 99;												// 클래스 안에서 복사된 숫자를 바꾸고 출력하는거라서 
		System.out.println("in method : " + argument);				// 클래스 밖의 인스턴스의 값은 바뀌지 않음
	}
	
	// 참조형 데이터타입의 매개변수를 받는 메서드
	// 참조형 데이터타입의 매개변수는 값을 가지고 있는 '주소'를 복사해서 받기 때문에
	// 호출부에서 참조하는 인스턴스에도 영향을 미침
	static void refferenceParameterMethod(OopTest2 argument) {		// b메서드에 a클래스를 담고 있는 인스턴스를 넣고
		argument.instanceInt = 99;									// b메서드 안에서 a클래스로 직접 가서 숫자를 바꾸고
		System.out.println("in method : " + argument.instanceInt);	// a클래스의 숫자를 출력하는거라서
	}																// b메서드 밖에 있는 a클래스를 담고 있는 인스턴스에도 
																	// 영향을 미침
	// 기본형 데이터타입을 반환하는 메서드
	static int basicReturnMethod() {
		int number = 10;
		return number;
	}
	
	// 참조형 데이터타입을 반환하는 메서드
	static OopTest2 refferenceReturnMethod() {
		OopTest2 object = new OopTest2();
		object.instanceInt = 100;
		object.instanceString = "문장입니다.";
		return object;
	}
	
	public static void main(String[] args) {
		
		int number = 0;
		basicParameterMethod(number);
		System.out.println("out method : " + number);
		
		System.out.println("=====================================");
		OopTest2 object = new OopTest2();
		object.instanceInt = 10;
		object.instanceString = "문자열";
		refferenceParameterMethod(object);
		System.out.println("out method : " + object.instanceInt);
		
		System.out.println("=====================================");
		
		int resultNumber = basicReturnMethod();
		System.out.println("resultNumber : " + resultNumber);
		
		OopTest2 resultObject = refferenceReturnMethod();
		System.out.println("resultObfect.instanceInt : " + resultObject.instanceInt);
		
		System.out.println("=====================================");
		
		OopTest2 object1 = new OopTest2();							// 이건 그냥 여기 화면에서 
		object1.instanceInt = 0;									// 인스턴스 생성, 숫자, 문자 다 입력한거임 (귀찮)
		object1.instanceString = "문자열";
		System.out.println("object1.instanceInt : " + object1.instanceInt);
		
		OopTest2 object2 = OopTest2.createInstance(20,"열자문");				// OopTest2클래스 내부에 
		System.out.println("object2.instanceInt : " + object2.instanceInt);	// 인스턴스 생성 메서드를 만들어 놓고
																			// 여기 화면에서 값만 입력하여 바로 만들게함
		System.out.println("=====================================");

		OopTest2 object3 = new OopTest2(200, "매개변수 생성자");
		System.out.println("object3.instanceInt : " + object3.instanceInt);
		
		System.out.println("=====================================");

		object3.instanceCharArray = new char[] {'a', 'b', 'c'};
		
		OopTest2 object4 = new OopTest2(object3);
		System.out.println("object4.instanceInt : " + object4.instanceInt);
		System.out.println(object3);
		System.out.println(object4);
		
		object3.instanceInt = 1;
		object3.instanceCharArray[0] = 'z';
		
		System.out.println("object3.instanceInt : " + object3.instanceInt);
		System.out.println("object4.instanceInt : " + object4.instanceInt);

		System.out.println("object3.instanceCharArray : " + object3.instanceCharArray[0]);
		System.out.println("object4.instanceCharArray : " + object4.instanceCharArray[0]);

		
		
		
	}
}
