package org.nagarro.advancedjava.web.hrmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank
	@Size(min = 5, max = 50, message 
    = "*UserName must be between 5 and 50 characters")
	private String username;
	
	@NotBlank
	@Pattern(regexp="((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})",message="*Password contain digit,special char [@#$%], and alphabet")  
	@Size(min = 5, max = 50, message 
    = "*password must be between 6 and 15 characters")
	private String password;
	
	
	@NotBlank
	@Size(min = 5, max = 50, message 
    = "* must be between 5 and 50 characters")
	private String name="HrName";

	

	public UserEntity( String username, String password, String name) {
		super();
		this.id = 0;
		this.username = username;
		this.password = password;
		this.name = name;
	}
	public UserEntity( String username, String password) {
		super();
		this.id = 0;
		this.username = username;
		this.password = password;
		
	}
	public UserEntity() {
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
