/**
 * 
 */
package com.java.skillmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.skillmanagement.entity.EmployeeSkillProficiency;
import com.java.skillmanagement.exception.UserNotFoundException;
import com.java.skillmanagement.service.EmployeeSkillManageService;



@CrossOrigin
@RestController
public class EmployeeSkillManageController {

	@Autowired
	EmployeeSkillManageService employeeSkillService;
	
	/**
	 * API to retrieve all the records
	 * 
	 *  
	 */
	
	@GetMapping("/employee/skill")
    public ResponseEntity<Object> findAll(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                     @RequestParam(value = "size", defaultValue = "10") Integer size) throws Exception {
		try {
			Page<EmployeeSkillProficiency> returnData= null;
			PageRequest request = PageRequest.of(page - 1, size);
			returnData = employeeSkillService.findAll(request);
			return new ResponseEntity<Object>(returnData, HttpStatus.OK);			
		}catch(Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}		       
    }
	
	/**
	 * API to retrieve the record by id
	 * 
	 *  
	 */
	
	@GetMapping("/employee/{id}")
    public EmployeeSkillProficiency retriveUser(@PathVariable("id") int id) throws Exception {
		
			EmployeeSkillProficiency returnData = employeeSkillService.findOne(id);
			if (returnData == null) {
				throw new UserNotFoundException("id: "+ id); 
			} else {
				return returnData;
			}	  
	}
	
	/**
	 * API to retrieve the records by skillname
	 * 
	 *  
	 */
	
	@GetMapping(value = "/employee/skill/{skillname}")
	public List<EmployeeSkillProficiency> getPersoneByName(@PathVariable("skillname") String skill) throws Exception {
			
		List<EmployeeSkillProficiency> returnData = employeeSkillService.findBySkills(skill);
			if (returnData.size() == 0) {
				throw new UserNotFoundException("skillName: "+ skill); 
			} else {
				return returnData;
			}	
	}
	
	/**
	 * API to create the record
	 * 
	 *  
	 */
	
	@PostMapping("/employee/skill")
    public ResponseEntity<Object> createUserSkill(@RequestBody EmployeeSkillProficiency inputData) throws Exception {
		
		try {
    		EmployeeSkillProficiency returnData= null;
			returnData = employeeSkillService.save(inputData);
			return new ResponseEntity<Object>(returnData, HttpStatus.CREATED); 			
		}catch(Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	/**
	 * API to update the record
	 * 
	 * 
	 */
	
    @PutMapping("/employee/{id}")
    public EmployeeSkillProficiency updateUserSkill(@PathVariable("id") int id,
    												@RequestBody EmployeeSkillProficiency inputData) throws Exception{		
    	EmployeeSkillProficiency returnData = employeeSkillService.update(inputData);
    	if (returnData == null) {
			throw new UserNotFoundException("id: "+ id); 
		} else {
			return returnData;
		}
    }
    
    /**
	 * API to delete the record
	 * 
	 *  
	 */
    
    @DeleteMapping("/employee/{id}" )
    public ResponseEntity<Object> deleteUserSkill(@PathVariable("id") int id) {
    	
    	try {
    		employeeSkillService.delete(id);
    		return new ResponseEntity<Object>("Record deleted successfully..", HttpStatus.OK); 
			
		}catch(Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
}
