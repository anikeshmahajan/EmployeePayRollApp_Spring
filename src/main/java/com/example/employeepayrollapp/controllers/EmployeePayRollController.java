package com.example.employeepayrollapp.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employeepayrollapp.dto.EmployeePayRollDTO;
import com.example.employeepayrollapp.dto.ResponseDTO;
import com.example.employeepayrollapp.model.EmployeePayRollData;
import com.example.employeepayrollapp.services.EmployeePayRollService;
import com.example.employeepayrollapp.services.IEmployeePayRollService;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayRollController {

	@Autowired
	private IEmployeePayRollService employeePayrollService;
	
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayRollData()
	{
		List<EmployeePayRollData>  empData = null;
		empData = employeePayrollService.getEmployeePayrollData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayRollData(@PathVariable("empId") int empId)
	{
		EmployeePayRollData employeePayRollData = employeePayrollService.getEmployeePayRollDataById(empId);
		ResponseDTO respDTO = new ResponseDTO("Get Call Success for id" , employeePayRollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayRollData(
			@RequestBody EmployeePayRollDTO empPayRollDTO)
	{
		EmployeePayRollData employeePayRollData = employeePayrollService.createEmployeePayRollData(empPayRollDTO);
		ResponseDTO respDTO = new ResponseDTO("Create PayRoll Data For ::" , employeePayRollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayRollData(
			@PathVariable("empId") int empId,
			@RequestBody EmployeePayRollDTO empPayRollDTO)
	{
		EmployeePayRollData employeePayRollData = employeePayrollService.updateEmployeePayRollData(empId, empPayRollDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated PayRoll Data is ::" , employeePayRollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayRollData(
					@PathVariable("empId") int empId) 
	{
		employeePayrollService.deleteEmployeePayRollData(empId);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully ::", empId );
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	
	}
	
}
