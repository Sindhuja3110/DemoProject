package com.DemoSpringboot.Demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.DemoSpringboot.Demo.model.Customer;

@Service
public interface CustomerService {

//	EmployeeResponse createEmployee(EmployeeRequest request);
//
//	EmployeeResponse getEmployeeById(Long id);
//
//	EmployeeResponse updateEmployee(Long id, EmployeeRequest request);
//
//	void deleteEmployee(Long id);
//
//	List<EmployeeResponse> getAllEmployees();

	Customer createCustomer(Customer customer);

	Customer updateCustomer(long id, Customer customer);

	List<Customer> listOfCustomer();

	Customer getCustomerbByid(long id);

	void deleteCustomer(long id);

}
