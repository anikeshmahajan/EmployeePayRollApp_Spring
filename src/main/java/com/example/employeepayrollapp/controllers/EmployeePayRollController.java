package com.example.employeepayrollapp.controllers;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeepayrollapp.dto.EmployeePayRollDTO;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayRollController {

	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<String> getEmployeePayRollData()
	{
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayRollData(@PathVariable("empId") int empId)
	{
		return new ResponseEntity<String>("Get Call Success for id" + empId, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addEmployeePayRollData(
			@RequestBody EmployeePayRollDTO empPayRollDTO)
	{
		return new ResponseEntity<String>("Create PayRoll Data For ::" + empPayRollDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayRollData(
			@RequestBody EmployeePayRollDTO empPayRollDTO)
	{
		return new ResponseEntity<String>("Updated PayRoll Data For ::" + empPayRollDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeePayRollData(
					@PathVariable("empId") int empId) 
	{
		return new ResponseEntity<String>("Delete Call Success for ::" + empId , HttpStatus.OK);
	}
	
}
