package org.nagarro.advancedjava.web.hrmanager.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.nagarro.advancedjava.web.hrmanager.Constant.Constant;

public class EmployeeModel {

	
	
	private int empId;
	
	@Size(max=100,message=Constant.MAX_VALIDATION_100)
	@NotBlank(message=Constant.NOT_BLANK)
	private String empName;
	
	@Size(max=100,message=Constant.MAX_VALIDATION_500)
	@NotBlank(message=Constant.NOT_BLANK)
	private String empLocation;
	
	@Email(message=Constant.EMAIL_VALIDATION)
	@NotBlank(message=Constant.NOT_BLANK)
	private String email;
	
	@Pattern(regexp="^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$",message="* Date field in format dd/mm/yyyy")
	@NotBlank(message=Constant.NOT_BLANK)
	private String dob;
	
	@Override
	public String toString() {
		return "HrController [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + ", email="
				+ email + ", dob=" + dob + "]";
	}
	public EmployeeModel(){
		
	}
	public EmployeeModel(int empId, String empName, String empLocation, String email, String dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
		this.email = email;
		this.dob = dob;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
