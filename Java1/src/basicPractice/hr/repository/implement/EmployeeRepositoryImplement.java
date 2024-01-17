package basicPractice.hr.repository.implement;

import java.util.List;

import basicPractice.hr.entity.EmployeeEntity;
import basicPractice.hr.repository.EmployeeRepository;

public class EmployeeRepositoryImplement implements EmployeeRepository {

	@Override
	public boolean save(EmployeeEntity employeeEntity) {
		List<EmployeeEntity> list = EmployeeRepository.employeeList;
		
		for (int index = 0; index < list.size(); index++) {
			String employeeNumber = list.get(index).getEmployeeNumber();
			
			boolean isEqualEmployeeNumber =
					employeeEntity.getEmployeeNumber().equals(employeeNumber);
			
			if (isEqualEmployeeNumber) {
				list.set(index, employeeEntity);
				return true;
			}
		}
		
		list.add(employeeEntity);
		return true;
		
//		boolean result = false;
//		
//		for (int index = 0; index < list.length; index++) {
//			if (list[index] == null) {
//				list[index] = employeeEntity;
//				result = true;
//				break;
//			}
//		
//			EmployeeEntity item = list[index];
//			boolean isEqualEmplyeeNumber = 
//					item.getEmployeeNumber().equals(employeeEntity.getEmployeeNumber());
//			if (isEqualEmplyeeNumber) {
//				list[index] = employeeEntity;
//				result = true;
//				break;
//			}	
		
//		return result;
	}

	@Override
	public boolean delete(EmployeeEntity employeeEntity) {
		List<EmployeeEntity> list = EmployeeRepository.employeeList;
		boolean result = list.remove(employeeEntity);
		return result;
		
//		boolean result = false;
//		EmployeeEntity[] list = EmployeeRepository.employeeList;
//		
//		boolean found = false;
//		for (int index = 0; index < list.length; index++) {
//			
//			if (list[index] == employeeEntity) {
//				found = true;
//				result = true;
//			}
//			
//			boolean isLastIndex = index == list.length - 1;
//			if (found && isLastIndex) {
//				list[index] = null;
//				break;
//			}
//			
//			if (found) list[index] = list[index + 1];
//			
//		}
//		
//		return result;
	}

	@Override
	public List<EmployeeEntity> findAll() {
		List<EmployeeEntity> result = EmployeeRepository.employeeList;
		return result;
	}

	@Override
	public EmployeeEntity findByEmployeeNumber(String employeeNumber) {
		EmployeeEntity result = null;
		List<EmployeeEntity> list = EmployeeRepository.employeeList;
		
		for (EmployeeEntity employeeEntity: list) {
			
			boolean isEqualEmployeeNumber =
			employeeEntity.getEmployeeNumber().equals(employeeNumber);
			
			if (isEqualEmployeeNumber) {
				result = employeeEntity;
				break;
			}
			
		}
		
		return result;
		
//		EmployeeEntity result = null;
//		
//		EmployeeEntity[] employeeList = EmployeeRepository.employeeList;
//		for (EmployeeEntity employeeEntity : employeeList) {
//			if (employeeEntity == null) break;
//			
//			boolean isEqualEmployeeNumber = 
//					employeeEntity.getEmployeeNumber().equals(employeeNumber);
//			
//			if (isEqualEmployeeNumber) {
//				result = employeeEntity;
//				break;
//			}
//		}
//		
//		return result;
	}

}
