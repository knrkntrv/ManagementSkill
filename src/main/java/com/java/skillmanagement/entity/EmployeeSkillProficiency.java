/**
 * 
 */
package com.java.skillmanagement.entity;

import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Table(name = "employee_skill_proficiency")
public class EmployeeSkillProficiency implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@NotEmpty
    private String user_id;
	
	@NotEmpty
    private String user_name;
	
	@NotEmpty
    private String skill_id;
	
    @NotEmpty
    private String skills;
    
    @NotEmpty
    private String proficiency;
    
	@CreationTimestamp
    private Date effective_date;
	
	@CreationTimestamp
    private Date create_date;
	
    @UpdateTimestamp
    private Date update_date;
}
