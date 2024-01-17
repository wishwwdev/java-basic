package basicPractice.hr.controller;

import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;

public interface MainController {

	void postEmployee(PostEmployeeRequestDto dto); 				
	void getEmployeeList();					
	void getEmployee(String employeeNumber);		
	void patchEmployee(PatchEmployeeRequestDto dto);				
	void deleteEmployee(String employeeNumber);
	
}
