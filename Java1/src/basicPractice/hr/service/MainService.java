package basicPractice.hr.service;

import java.util.List;

import basicPractice.hr.dto.GetEmployeeListResponseDto;
import basicPractice.hr.dto.GetEmployeeResponseDto;
import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;

// 인사등록 : 사용가자 사번 이름, 주소, 생년월일, 이메일, 부서를 입력하면 
// 입력한 데이터를 기반으로 저장소에 저장됨
// 직원 조회 (전체) : 저장소에 저장된 직원 정보 리스트를 출력
// 직원 조회 (특정 직원) : 사번을 입력하면 입력한 사번에 해당하는 직원 정보를 출력
// 직원 정보 수정 : 사번을 입력하고 이름, 주소, 생년월일, 이메일, 부서를 입력하면
//	    	    입력한 데이터를 기반으로 해당 사번의 직원 정보를 수정
// 직원 삭제 : 사번을 입력하면 해당하는 사번의 직원 정보를 저장소에서 제거
public interface MainService {
	
	// 작성, 수정, 삭제와 관련된 기능은 반환타입이 대부분 성공/실패
	// 읽기와 관련된 기능은 반환 타입이 대부분 DTO 형식의 객체
	
	// 작성, 수정과 관련된 기능은 입력 타입이 대부분 DTO 형식의 객체
	// 읽기, 삭제와 관련된 기능은 입력 타입이 대부분 단일 형식의 타입
	boolean postEmployee(PostEmployeeRequestDto dto); 				// 반환 : 논리 타입	입력 : DTO 객체
	List<GetEmployeeListResponseDto> getEmployeeList();					// 반환 : DTO 객체	입력 : 단일 타입
	GetEmployeeResponseDto getEmployee(String employeeNumber);		// 반환 : DTO객체	입력 : 단일 타입
	boolean patchEmployee(PatchEmployeeRequestDto dto);				// 반환 : 논리 타입	입력 : DTO 객체
	boolean deleteEmployee(String employeeNumber);					// 반환 : 논리 타입	입력 : 단일 타입	

}
