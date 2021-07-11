/**
 * 
 */
package com.java.skillmanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.java.skillmanagement.entity.EmployeeSkillProficiency;


public interface EmployeeSkillManageService {
	
    Page<EmployeeSkillProficiency> findAll(Pageable pageable);
    
    EmployeeSkillProficiency save(EmployeeSkillProficiency inputData);

    EmployeeSkillProficiency update(EmployeeSkillProficiency inputData);
    
    void delete(int id);
    
    EmployeeSkillProficiency findOne(int id);
    
    List<EmployeeSkillProficiency> findBySkills(String name);
    
}
