package com.user_0.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="user_table")
public class UserDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String fullName;
	private String email;
	private String address;
	private String qualification;
	private String password;

}
