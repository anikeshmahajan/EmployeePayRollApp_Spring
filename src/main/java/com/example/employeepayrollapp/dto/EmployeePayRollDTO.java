package com.example.employeepayrollapp.dto;

public class EmployeePayRollDTO {
	public Long  salary;
	public String name;
	public EmployeePayRollDTO(long i, String name) {
		super();
		this.salary = i;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary" + salary + "name" + name;
	}
}
