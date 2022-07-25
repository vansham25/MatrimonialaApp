package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Subscription;

public interface SubscriptionRepository  extends JpaRepository<Subscription, Long>{
	@Query(nativeQuery = true, value="select * from subscription where customer_id= ?1")

	Subscription getSubscriptionByCustomerId(Long customerId);

}
