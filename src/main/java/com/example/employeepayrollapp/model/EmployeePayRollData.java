package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayRollDTO;

public class EmployeePayRollData {

	private int employeeId;
	private String name;
	private long salary;
	
	
	public EmployeePayRollData() {
			}


	public EmployeePayRollData(int empId, EmployeePayRollDTO emplpayrolldto	) {
		super();
		this.employeeId = empId;
		this.name = emplpayrolldto.name;
		this.salary = emplpayrolldto.salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public String getName() {
		return name;
	}


	public long getSalary() {
		return salary;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}

	
}
