package com.jspiders.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jspiders.springrest.pojo.EmployeePOJO;
import com.jspiders.springrest.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public EmployeePOJO addEmployee(EmployeePOJO employee) {
		EmployeePOJO pojo = repository.addEmployee(employee);
		return pojo;
	}

	public EmployeePOJO searchEmployee(int id) {
	EmployeePOJO pojo =	repository.searchEmployee(id);
		return pojo;
	}

	public EmployeePOJO removeEmployee(int id) {
		EmployeePOJO pojo = repository.removeEmployee(id);
		return pojo;
	}

	public EmployeePOJO updateEmployee(int id, String name, String email, long contact, String designation,
			double salary) {
		EmployeePOJO pojo = repository.updateEmployee(id,name,email,contact,designation,salary);
		return pojo;
	}

	public List<EmployeePOJO> searchAllEmployee() {
		List<EmployeePOJO> employees = repository.searchAllEmployee();
		return employees;
	}



	
}
