package org.nagarro.advancedjava.web.hrmanager.services;

import java.io.PrintWriter;

import org.nagarro.advancedjava.web.hrmanager.model.EmployeeModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("csv")
@Service
public class CsvServiceImpl implements CsvService{

	@Override
	public void downloadCsvFile(PrintWriter printWriter, EmployeeModel[] employees) {
		printWriter.write("Employeecode, EmployeeName , EmployeeLocation, email, dob\n");
		for(EmployeeModel employee: employees) {
			printWriter.write(employee.getEmpId()+","+employee.getEmpName()+","+employee.getEmpLocation()+","+employee.getEmail()
			+","+employee.getDob()+"\n");
		}
		
	}

}
