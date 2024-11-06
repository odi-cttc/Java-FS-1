package com.cttc.emp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "emp")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	
	@Column(length = 50)
	private String firstName;
	
	@Column(length = 50)
	private String lastName;
	
	@Column(name = "mail_id", length = 100, unique = true)
	private String mail;
	
	@Column(length = 10, unique = true)
	private String mobile;
	
	private LocalDate dob;
	
	@CreatedBy
	private String creUser;
	
	@CreationTimestamp
	private LocalDateTime creDate;
	
	@LastModifiedBy
	private String modifyBy;
	
	@UpdateTimestamp
	private LocalDateTime modifyDate;
}
