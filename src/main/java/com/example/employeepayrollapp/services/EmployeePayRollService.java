package com.example.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeepayrollapp.dto.EmployeePayRollDTO;
import com.example.employeepayrollapp.model.EmployeePayRollData;

@Service
public class EmployeePayRollService  implements IEmployeePayRollService{

	

	@Override
	public List<EmployeePayRollData> getEmployeePayrollData() {
		List<EmployeePayRollData> employeePayRollData = new ArrayList<>();
		employeePayRollData.add(new EmployeePayRollData(1,new EmployeePayRollDTO(3000, "Anikesh")));
		return employeePayRollData;
	}

	@Override
	public EmployeePayRollData getEmployeePayRollDataById(int empId) {

		EmployeePayRollData employeePayRollData = null;
		employeePayRollData = new EmployeePayRollData(empId, new EmployeePayRollDTO(3000,"Anikesh"));
		return employeePayRollData;
	}

	@Override
	public EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO empPayRollDTO) {
		EmployeePayRollData employeePayRollData = null;
		employeePayRollData = new EmployeePayRollData(1,  empPayRollDTO);
		return employeePayRollData;
	}

	@Override
	public EmployeePayRollData updateEmployeePayRollData(int empId, EmployeePayRollDTO empPayRollDTO) {
		EmployeePayRollData employeePayRollData = null;
		employeePayRollData = new EmployeePayRollData(empId,  empPayRollDTO);
		return employeePayRollData;
	}

	@Override
	public void deleteEmployeePayRollData(int empId) {
		// TODO Auto-generated method stub
		
	}

}
