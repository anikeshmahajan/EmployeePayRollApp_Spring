package com.example.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeepayrollapp.dto.EmployeePayRollDTO;
import com.example.employeepayrollapp.model.EmployeePayRollData;

@Service
public class EmployeePayRollService  implements IEmployeePayRollService{

	private List<EmployeePayRollData> employeePayRollData = new ArrayList<>();
	

	@Override
	public List<EmployeePayRollData> getEmployeePayrollData() {
//		List<EmployeePayRollData> employeePayRollData = new ArrayList<>();
//		employeePayRollData.add(new EmployeePayRollData(1,new EmployeePayRollDTO(3000, "Anikesh")));
		return employeePayRollData;
	}

	@Override
	public EmployeePayRollData getEmployeePayRollDataById(int empId) {

//		EmployeePayRollData employeePayRollData = null;
//		employeePayRollData = new EmployeePayRollData(empId, new EmployeePayRollDTO(3000,"Anikesh"));
		return employeePayRollData.get(empId-1);
	}

	@Override
	public EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO empPayRollDTO) {
		EmployeePayRollData empData = null;
		empData = new EmployeePayRollData(employeePayRollData.size()+1,  empPayRollDTO);
		employeePayRollData.add(empData);
		return empData;
	}

	@Override
	public EmployeePayRollData updateEmployeePayRollData(int empId, EmployeePayRollDTO empPayRollDTO) {
		EmployeePayRollData empData = this.getEmployeePayRollDataById(empId);
		empData.setName(empPayRollDTO.name);
		empData.setSalary(empPayRollDTO.salary);
		employeePayRollData.set(empId-1, empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayRollData(int empId) {
		
		employeePayRollData.remove(empId-1);
	}

}
