package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.Subscription;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.SubscriptionRepository;

	@RestController
	@RequestMapping("/api/")
//	@PreAuthorize("hasRole('Manager')")
	public class SubscriptionController {
		@Autowired
		SubscriptionRepository subscriptionRepository;
		@Autowired
		CustomerRepository customerRepository;
	 
		@PostMapping("/addSubscription/{CustomerId}")
		public Subscription addRating(@RequestBody Subscription subs, @PathVariable("customerId") Long customerId) {
			Customer cust=customerRepository.findById(customerId).get();
			subs.setCustomer_id(cust);
		    return  subscriptionRepository.save(subs);
		}
		@GetMapping("/getSubscription/{customerId}")
		public Subscription getSubscription(@PathVariable("customerId") Long customerId) {
			Subscription subs=subscriptionRepository.getSubscriptionByCustomerId(customerId);
			Long subs_id=subs.getId();
			return subscriptionRepository.findById((long) subs_id).get();
		}
	}


