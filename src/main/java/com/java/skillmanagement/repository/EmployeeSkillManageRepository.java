/**
 * 
 */
package com.java.skillmanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.java.skillmanagement.entity.EmployeeSkillProficiency;


public interface EmployeeSkillManageRepository extends JpaRepository<EmployeeSkillProficiency, Integer>{
	
	EmployeeSkillProficiency findById(int id);
	
	Page<EmployeeSkillProficiency> findAll(Pageable pageable);	
	List<EmployeeSkillProficiency> findBySkills(String skills);

}