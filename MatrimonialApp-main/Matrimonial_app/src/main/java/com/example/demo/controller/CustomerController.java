package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.SubscriptionRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	SubscriptionRepository subscreiptionRepository;

	@GetMapping("/getCustomer")
//	@PreAuthorize("hasRole('ADMIN')")
	public List<Customer> getCustomer()
	{
		return customerRepository.findAll();
	}
	@GetMapping("/getCustomer/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
	public Customer getById(@PathVariable("id") int id)
	{
		return customerRepository.findById((long) id).get();
    }
	@PostMapping("/addCustomer")
//	@PreAuthorize("hasRole('ADMIN')")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	@PutMapping("/updateCustomer/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("id") int id) {
		Customer cust = customerRepository.findById((long) id).get();
		if(customer.getName()!=null) cust.setName(customer.getName());
		if(customer.getAge()!=null) cust.setAge(customer.getAge());
		if(customer.getHeight()!=null) cust.setHeight(customer.getHeight());
		if(customer.getReligion()!=null) cust.setReligion(customer.getReligion());
		if(customer.getCaste()!=null) cust.setCaste(customer.getCaste());
		if(customer.getMaritalStatus()!=null) cust.setMaritalStatus(customer.getMaritalStatus());
		if(customer.getCity()!=null) cust.setCity(customer.getCity());
		if(customer.getMotherTongue()!=null) cust.setMotherTongue(customer.getMotherTongue());
		if(customer.getComplexion()!=null) cust.setComplexion(customer.getComplexion());
		if(customer.getWeight()!=null) cust.setWeight(customer.getWeight());
		if(customer.getBloodGroup()!=null) cust.setBloodGroup(customer.getBloodGroup());
		if(customer.getDiet()!=null) cust.setDiet(customer.getDiet());

		if(customer.getEducation()!=null) cust.setEducation(customer.getEducation());
		if(customer.getFamilyMembers()!=null) cust.setFamilyMembers(customer.getFamilyMembers());
		if(customer.getFatherOccupation()!=null) cust.setFatherOccupation(customer.getFatherOccupation());
		
		if(customer.getMotherOccupation()!=null) cust.setMotherOccupation(customer.getMotherOccupation());
		if(customer.getOccupation()!=null) cust.setOccupation(customer.getOccupation());
		if(customer.getAnnualIncome()!=0) cust.setAnnualIncome(customer.getAnnualIncome());
		return customerRepository.save(cust);
	}
	@DeleteMapping("/deleteCustomer/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
	public String deleteCustomer(@PathVariable("id") int id) {
		Customer customer = customerRepository.findById((long) id).get();
		customerRepository.delete(customer);
		return "Customer is successfully removed";
	}

}
