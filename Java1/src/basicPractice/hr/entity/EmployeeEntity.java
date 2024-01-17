package basicPractice.hr.entity;

import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;

//직원 : 사번, 이름, 주소, 생년월일, 이메일, 부서
public class EmployeeEntity {
	
	private String employeeNumber;
	private String name;
	private String address;
	private String birth;
	private String email;
	private String department;
	
	public EmployeeEntity() {}

	public EmployeeEntity(String employeeNumber, String name, String address, String birth, String email,
			String department) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.address = address;
		this.birth = birth;
		this.email = email;
		this.department = department;
	}
	
	public EmployeeEntity(PostEmployeeRequestDto dto) {
		this.employeeNumber = dto.getEmployeeNumber();
		this.name = dto.getName();
		this.address = dto.getAddress();
		this.birth = dto.getBirth();
		this.email = dto.getEmail();
		this.department = dto.getDepartment();
	}
	
	public EmployeeEntity(PatchEmployeeRequestDto dto) {
		this.employeeNumber = dto.getEmployeeNumber();
		this.name = dto.getName();
		this.address = dto.getAddress();
		this.birth = dto.getBirth();
		this.email = dto.getEmail();
		this.department = dto.getDepartment();
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeNumber=" + employeeNumber + ", name=" + name + ", address=" + address
				+ ", birth=" + birth + ", email=" + email + ", department=" + department + "]";
	}
	
	
			
}
