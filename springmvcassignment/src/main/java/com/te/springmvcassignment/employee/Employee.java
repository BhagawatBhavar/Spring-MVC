package com.te.springmvcassignment.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
	private int id;
	private String username;
	private String email;
	private String designation;
	
	
	
	

}
