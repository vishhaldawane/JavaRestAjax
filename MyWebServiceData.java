package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

@RequestMapping("/mywebdata")
public class MyWebServiceData {
	
	EmployeeDAO empDao = new EmployeeDAOImpl(); // MODEL - DAO LAYER

	public MyWebServiceData() {
		System.out.println("MyWebServiceData() ctor...");
		
	}
	@GetMapping("/getEmps")
	public List<Employee> getAllEmployees()
	{
		System.out.println("getAllEmployees() returning the array list..");
		return empDao.getEmployees();
	}
	
	
	@GetMapping("/getEmp/{eno}") // http://localhost:8080/myweb/getEmp/101
	public ResponseEntity<?> getEmployee(@PathVariable("eno") int empno) {
		System.out.println("getEmployee() returning the employee...");
		boolean foundEmp = false;
		Employee tempEmp = null;
		
		tempEmp = empDao.getEmployee(empno);
		
		if(tempEmp!=null) {
			return ResponseEntity.ok(tempEmp);
		}
		else {
			EmployeeNotFoundException empNotFndEx = 
					new EmployeeNotFoundException("Employee does not exists...");
			return ResponseEntity.status(404).body(empNotFndEx.getMessage());
		}
	}
	
	@PostMapping("/addEmp") // http://localhost:8080/myweb/addEmp  -> BODY BY POSTMAN
	public ResponseEntity<?> addEmployee(@RequestBody Employee empObj) {
		System.out.println("addEmployee() adding the employee...");
		Employee tempEmp = null;
		
		tempEmp = empDao.getEmployee(empObj.getEmpno()); //CHECK THE DB
	
		if(tempEmp==null) {
			System.out.println("adding...");
			empDao.addEmployee(empObj); // INSERT TO THE DB
			return ResponseEntity.ok(empObj);
		}
		else {
			System.out.println("else ..."+tempEmp);
			System.out.println("tempEmp : "+tempEmp.getEmpno());
			System.out.println("tempEmp : "+tempEmp.getName());
			System.out.println("tempEmp : "+tempEmp.getSalary());
			System.out.println("tempEmp : "+tempEmp.getComm());
			
			EmployeeAlreadyExistException empExistEx = new 
				EmployeeAlreadyExistException("Employee "
						+ "already exists with this ID "+empObj.getEmpno());
			return ResponseEntity.status(404).body(empExistEx.getMessage());
		}
	}
	
	@PutMapping("/updateEmp") // http://localhost:8080/myweb/addEmp  -> BODY BY POSTMAN
	public ResponseEntity<?> updateEmployee(@RequestBody Employee empObj) {
		System.out.println("updateEmployee() udpating the employee...");
		Employee tempEmp = null;
		
		tempEmp = empDao.getEmployee(empObj.getEmpno()); //CHECK THE DB
		
		if(tempEmp!=null) {
			empDao.updateEmployee(empObj); // update TO THE DB
			return ResponseEntity.ok(empObj);
		}
		else {
			EmployeeNotFoundException empNotFndEx = new 
					EmployeeNotFoundException("Employee "
						+ "does NOT exists with this ID "+empObj.getEmpno());
			return ResponseEntity.status(404).body(empNotFndEx.getMessage());
		}
	}
	
	@DeleteMapping("/deleteEmp/{eno}") // http://localhost:8080/myweb/addEmp  -> BODY BY POSTMAN
	public ResponseEntity<?> deleteEmployee(@PathVariable("eno") int x) {
		System.out.println("deleteEmployee() deleting the employee...");
		Employee tempEmp = null;
		
		tempEmp = empDao.getEmployee(x); //CHECK THE DB
		
		if(tempEmp!=null) {
			empDao.deleteEmployee(x); // update TO THE DB
			return ResponseEntity.ok("Employee deleted : "+x);
		}
		else {
			EmployeeNotFoundException empNotFndEx = new 
					EmployeeNotFoundException("Employee "
						+ "does NOT exists with this ID "+x);
			return ResponseEntity.status(404).body(empNotFndEx.getMessage());
		}
	}
	
	
	@GetMapping("/greet") // http://localhost:8080/myweb/greet
	public String greeting()
	{
		return "<h2> Welcome to the world of web services </h2>";
	}
	
	@GetMapping("/welcome") // http://localhost:8080/myweb/welcome
	public String welcomeToHome()
	{
		return "<h2> Welcome to the Home of this website </h2>";
	}
}
