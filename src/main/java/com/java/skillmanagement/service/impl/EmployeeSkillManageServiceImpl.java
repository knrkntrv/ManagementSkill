/**
 * 
 */
package com.java.skillmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.java.skillmanagement.entity.EmployeeSkillProficiency;
import com.java.skillmanagement.enums.ResultEnum;
import com.java.skillmanagement.exception.MyException;
import com.java.skillmanagement.repository.EmployeeSkillManageRepository;
import com.java.skillmanagement.service.EmployeeSkillManageService;


@Service
public class EmployeeSkillManageServiceImpl implements EmployeeSkillManageService{
	
	@Autowired
	EmployeeSkillManageRepository empSkillRepository;
	
	@Override
    public Page<EmployeeSkillProficiency> findAll(Pageable pageable) {
        return empSkillRepository.findAll(pageable);
    }
	
	@Override
    public EmployeeSkillProficiency update(EmployeeSkillProficiency empInfo) {

        return empSkillRepository.save(empInfo);
    }

    @Override
    public EmployeeSkillProficiency save(EmployeeSkillProficiency empInfo) {
    	return update(empInfo);
    }

    @Override
    public void delete(int Id) {
    	EmployeeSkillProficiency empInfo = findOne(Id);
        if (empInfo == null) throw new MyException(ResultEnum.PRODUCT_NOT_EXIST);
        empSkillRepository.delete(empInfo);

    }
    
    @Override
    public EmployeeSkillProficiency findOne(int id) {  	

    	EmployeeSkillProficiency returnData = empSkillRepository.findById(id);
        return returnData;
    }    
    
    @Override
	public List<EmployeeSkillProficiency> findBySkills(String name){
    	return  empSkillRepository.findBySkills(name);
    }
   
}
