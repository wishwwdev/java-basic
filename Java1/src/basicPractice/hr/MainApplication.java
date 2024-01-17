package basicPractice.hr;

import java.util.Scanner;

import basicPractice.hr.controller.MainController;
import basicPractice.hr.controller.implement.MainControllerImplement;
import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;
import basicPractice.hr.repository.EmployeeRepository;
import basicPractice.hr.repository.implement.EmployeeRepositoryImplement;
import basicPractice.hr.service.MainService;
import basicPractice.hr.service.implement.MainServiecImplement;

// 간단한 인사관리 프로그램
// 인사 등록, 직원 조회(전체, 특정 직원), 직원 정보 수정, 직원 삭제
// [CRUD] : Create, Read, Update, Delete

// 관리할 데이터
// 직원 : 사번, 이름, 주소, 생년월일, 이메일, 부서

// 기능의 세부사항
// 인사등록 : 사용가자 사번 이름, 주소, 생년월일, 이메일, 부서를 입력하면 
//		   입력한 데이터를 기반으로 저장소에 저장됨
// 직원 조회 (전체) : 저장소에 저장된 직원 정보 리스트를 출력
// 직원 조회 (특정 직원) : 사번을 입력하면 입력한 사번에 해당하는 직원 정보를 출력
// 직원 정보 수정 : 사번을 입력하고 이름, 주소, 생년월일, 이메일, 부서를 입력하면
// 			    입력한 데이터를 기반으로 해당 사번의 직원 정보를 수정
// 직원 삭제 : 사번을 입력하면 해당하는 사번의 직원 정보를 저장소에서 제거

public class MainApplication {
	
	public static MainController mainController;
	
	public static void main(String[] args) {
		
		while (true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("작업 : ");
			String method = scanner.nextLine();
			
			if (method.equalsIgnoreCase("end")) break;
			
			EmployeeRepository employeeRepositoy = new EmployeeRepositoryImplement();
			MainService mainService = new MainServiecImplement(employeeRepositoy);
			mainController = new MainControllerImplement(mainService);
			
			if (method.equals("POST /employee")) postEmployee();
			if (method.equals("GET /employee /list")) getEmployeeList();
			if (method.equals("GET /employee")) getEmployee();
			if (method.equals("PATCH /employee")) patchEmployee();
			if (method.equals("DELETE /employee")) deleteEmployee();
			
		}
		 
		
	}
	
	private static void postEmployee() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사번 : ");
		String employeeNumber = scanner.nextLine();
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("주소 : ");
		String address = scanner.nextLine();
		System.out.println("생년월일 : ");
		String birth = scanner.nextLine();
		System.out.println("이메일 : ");
		String email = scanner.nextLine();
		System.out.println("부서 : ");
		String department = scanner.nextLine();
		
		PostEmployeeRequestDto dto = new PostEmployeeRequestDto();
		dto.setEmployeeNumber(employeeNumber);
		dto.setName(name);
		dto.setAddress(address);
		dto.setBirth(birth);
		dto.setEmail(email);
		dto.setDepartment(department);
		
		mainController.postEmployee(dto);
		
	}
	
	// private 하는 이유 : 이 메서드는 이 클래스 내부에서만 사용할 것이라는 것을 명시하기 위해서임
	// static 하는 이유 : main메서드가 static이기 때문임 (static을 안쓰면 따로 인스턴스를 생성하는 과정을 거쳐야함)
	// void 하는 이유 : 따로 반환값이 없기 때문임 (MainController에서 syso을 할거임)
	private static void getEmployeeList() {
		
		mainController.getEmployeeList();
		
	}
	
	private static void getEmployee() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사번 : ");
		String employeeNumber = scanner.nextLine();
		
		mainController.getEmployee(employeeNumber);
	}
	
	private static void patchEmployee() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사번 : ");
		String employeeNumber = scanner.nextLine();
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("주소 : ");
		String address = scanner.nextLine();
		System.out.println("생년월일 : ");
		String birth = scanner.nextLine();
		System.out.println("이메일 : ");
		String email = scanner.nextLine();
		System.out.println("부서 : ");
		String department = scanner.nextLine();
		
		PatchEmployeeRequestDto dto = new PatchEmployeeRequestDto();
		dto.setEmployeeNumber(employeeNumber);
		dto.setName(name);
		dto.setAddress(address);
		dto.setBirth(birth);
		dto.setEmail(email);
		dto.setDepartment(department);
		
		mainController.patchEmployee(dto);
	}
	
	private static void deleteEmployee() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사번 : ");
		String employeeNumber = scanner.nextLine();
		
		mainController.deleteEmployee(employeeNumber);
	}
}
