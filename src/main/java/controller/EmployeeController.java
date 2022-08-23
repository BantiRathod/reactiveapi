package controller;

import java.time.Duration;

import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repositories.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo; 

	@GetMapping("/getallemployee")
	public Flux<Employee> getAllEmployee()
	{  
		System.out.println("consumed");
	    return employeeRepo.findAll();
	}

	  @GetMapping("/getEmployee/{id}") 
	  public Mono<Employee> getEmployee(@PathVariable String id) {
	  return employeeRepo.findById(id); 
	  }
	  	  
	  @PostMapping("/employee") 
	  public Mono<Employee> saveEmployee(@RequestBody Employee emp) {
	  
		  return employeeRepo.save(emp);
		   
		  
	  }
	 
}
