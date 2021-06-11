package org.nagarro.advancedjava.web.hrmanager.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.nagarro.advancedjava.web.hrmanager.model.EmployeeModel;
import org.nagarro.advancedjava.web.hrmanager.model.UserEntity;
import org.nagarro.advancedjava.web.hrmanager.services.EmployeeService;
import org.nagarro.advancedjava.web.hrmanager.services.RegisterEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller
public class HrController {

	@Autowired
	@Qualifier("emp")
	private EmployeeService empService;
	private int id = 32;

	@Autowired
	private RegisterEmployee regEmp;
//	
//	@Qualifier("csv")
//	@Autowired
//	private CsvServiceImpl csvService;

	private boolean flag = false;

	// upload the employee details
	@GetMapping("/uploademp")
	public String uploadEmployeeDetail() {
		if (flag) {
			return "empregistration";
		} else {
			return "redirect:login";
		}
	}

	// get employee details object
	@PostMapping("/empdetails")
	public String uploadEmployeeDetail(@Valid @ModelAttribute("emp") EmployeeModel emp, BindingResult result,
			Model model) {
		if (flag) {
			if (result.hasErrors()) {
				System.out.print("Error in form");
				return "empregistration";
			}
			this.empService.addEmployee(emp);
			EmployeeModel[] list = empService.getUserList();
			System.out.println(list);

			model.addAttribute("list", list);
			return "empdetails";
		} else {
			return "redirect:login";
		}
	}

	// handler of registration page
	@GetMapping("/registration")
	public String empRegistration() {
		if (flag) {
			return "empregistration";
		} else {
			return "redirect:login";
		}
	}

	// handler of Employee
	@GetMapping("/detail")
	public String empDetails(Model model) {
		if (flag) {

			EmployeeModel[] list = empService.getUserList();
			System.out.print(this.regEmp.uname);
			model.addAttribute("list", list);
			model.addAttribute("uname", "Welcome " + this.regEmp.uname);
			return "empdetails";
		} else {
			return "redirect:login";
		}
	}

	// handler to edit the employee details
	@GetMapping("/edit/{id}")
	public String uploadEmployeeDetail(@PathVariable("id") int id) {
		if (flag) {
			this.id = id;
			return "editform";
		} else {
			return "redirect:/login";
		}
	}

	// handler for employee edit form
	@PostMapping("/empedit")
	public String editEmployeeDetail(@Valid @ModelAttribute("emp") EmployeeModel emp, BindingResult result,
			Model model) {

		if (flag) {
			System.out.print(result);
			if (result.hasErrors()) {
				System.out.print("Error in form");
				return "editform";
			}
			this.empService.updateEmployee(emp, this.id);

			EmployeeModel[] list = empService.getUserList();
			model.addAttribute("list", list);
			model.addAttribute("uname", "Welcome " + this.regEmp.uname);
			return "empdetails";
		} else {
			return "redirect:login";
		}
	}

	// ___________Login Controller_____________

	// login handler
	@GetMapping("/")
	public String hrLogin() {
		return "login";
	}

	// registration handler
	@GetMapping("/register")
	public String hrRegistration() {
		return "registration";
	}

	// fetch object of registration
	@PostMapping("/loginUser")
	public ModelAndView hrRegistrationData(@Valid @ModelAttribute("hr") UserEntity hr, BindingResult result, Model m) {
		ModelAndView model = new ModelAndView();
		// check data binding related error

		System.out.print(result);
		if (result.hasErrors()) {
			System.out.println("error in input form");
			m.addAttribute("error", "*Alert: follow standerd format like character size between 5 and 30 ");
			model = new ModelAndView("registration");
			return model;
		}
		System.out.println(hr);
		regEmp.saveUser(hr);
		model = new ModelAndView("redirect:login");
		return model;
	}

	@PostMapping("/signUp")
	public ModelAndView hrlogin(@Valid @ModelAttribute("hr") UserEntity hr, BindingResult result, Model m) {
		ModelAndView model = new ModelAndView();
		// check data binding related error

		System.out.print(result);
		if (result.hasErrors()) {
			System.out.println("error in input form");
			m.addAttribute("error", "*Alert: follow standerd format like character size between 5 and 30 ");
			model = new ModelAndView("login");
			return model;
		}
		System.out.println(hr);
		this.flag = this.regEmp.userPasswordValidation(hr);
		System.out.println(this.flag);
		if (flag) {

			model = new ModelAndView("redirect:detail");
		} else {
			model = new ModelAndView("redirect:login");
		}
		return model;
	}

	// logout
	@GetMapping("/logout")
	public String hrLogOut() {
		flag = false;
		return "login";
	}

	// csv file download

//	  @GetMapping("/download") 
//	  public String dowloadCsvFile(HttpServletResponse response) throws IOException
//	  { 
//		  if(!(flag)) 
//		  { 
//			  return "redirect:login"; 
//			  }
//	  response.setContentType("pdf");
//	  response.setHeader("Content-Disposition", "attachment ; file=employee.pdf");
//	  csvService.downloadCsvFile(response.getWriter(), empService.getUserList());
//	  return "empdetails";

}
