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


import com.example.demo.model.Mediator;
import com.example.demo.repository.MediatorRepository;



@RestController
@RequestMapping("/api/")
public class MediatorController {


	@Autowired 
	MediatorRepository mediatorRepository;

	@GetMapping("/viewMediator")
//	@PreAuthorize("hasRole('ADMIN')")
	public List<Mediator> getMediator()
	{
		return mediatorRepository.findAll();
	}
	@GetMapping("/viewMediator/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
	public Mediator getById(@PathVariable("id") int id)
	{
		return mediatorRepository.findById((long) id).get();
    }
	@PostMapping("/addMediator")
//	@PreAuthorize("hasRole('ADMIN')")
	public Mediator addCustomer(@RequestBody Mediator mediator) {
		return mediatorRepository.save(mediator);
	}
	@DeleteMapping("/deleteMediator/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
	public String deleteCustomer(@PathVariable("id") int id) {
		Mediator mediator = mediatorRepository.findById((long) id).get();
		mediatorRepository.delete(mediator);
		return "Customer is successfully removed";
	}
	@PutMapping("/updateMediator/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
	public Mediator updateCustomer(@RequestBody Mediator mediator, @PathVariable("id") int id) {
		Mediator med = mediatorRepository.findById((long) id).get();
		if(mediator.getName()!=null) med.setName(mediator.getName());
		if(mediator.getAge()!=0) med.setAge(mediator.getAge());
		if(mediator.getAddress()!=null) med.setAddress(mediator.getAddress ());
		if(mediator.getNumber()!=null) med.setNumber(mediator.getNumber());
		return mediatorRepository.save(med);
}
}