package org.nagarro.advancedjava.web.hrmanager.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.nagarro.advancedjava.web.hrmanager.Constant.Constant;
import org.nagarro.advancedjava.web.hrmanager.model.EmployeeModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Component("emp")
@Service
public class EmployeeService {

	public EmployeeModel[] getUserList() {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

		ResponseEntity<EmployeeModel[]> result = restTemplate.exchange(Constant.BASE_GET_URL, HttpMethod.GET, entity,
				EmployeeModel[].class);
		EmployeeModel[] userArray = result.getBody();

		return userArray;
	}

	public ResponseEntity<EmployeeModel> addEmployee(EmployeeModel emp) {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<EmployeeModel> result = restTemplate.postForEntity(Constant.BASE_POST_URL, emp,
				EmployeeModel.class);
		System.out.print(result.getBody());
		return result;

	}

	public String updateEmployee(EmployeeModel emp, int id) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Integer> param = new HashMap<>();
		param.put("id", id);
		restTemplate.put(Constant.BASE_PUT_URL, emp, param);

		return "Success";
	}

}
