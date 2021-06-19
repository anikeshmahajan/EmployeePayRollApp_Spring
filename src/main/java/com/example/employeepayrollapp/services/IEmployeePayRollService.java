package com.example.employeepayrollapp.services;

import java.util.List;

import com.example.employeepayrollapp.dto.EmployeePayRollDTO;
import com.example.employeepayrollapp.model.EmployeePayRollData;

public interface IEmployeePayRollService {

	
	List<EmployeePayRollData> getEmployeePayrollData();
	
	EmployeePayRollData getEmployeePayRollDataById(int empId);
	EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO empPayRollDTO);
	EmployeePayRollData updateEmployeePayRollData(int empId,EmployeePayRollDTO empPayRollDTO);
	void deleteEmployeePayRollData(int empId);
}
