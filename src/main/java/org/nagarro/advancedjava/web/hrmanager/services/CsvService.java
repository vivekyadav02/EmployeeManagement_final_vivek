package org.nagarro.advancedjava.web.hrmanager.services;

import java.io.PrintWriter;

import org.nagarro.advancedjava.web.hrmanager.model.EmployeeModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface CsvService {

	public void downloadCsvFile(PrintWriter printWriter, EmployeeModel[] employeeModels);
}
