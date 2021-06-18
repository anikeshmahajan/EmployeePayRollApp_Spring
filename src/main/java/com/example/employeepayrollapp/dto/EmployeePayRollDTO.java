package com.example.employeepayrollapp.dto;

public class EmployeePayRollDTO {
	public Long  salary;
	public String name;
	public EmployeePayRollDTO(Long salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary" + salary + "name" + name;
	}
}
