package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Subscription {

	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	 @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="customer_id")
	  private Customer customer_id;
	 private String subscriptionDate;
	 private String subscriptionType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}
	public String getSubscriptionDate() {
		return subscriptionDate;
	}
	public void setSubscriptionDate(String subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public Subscription(Long id, Customer customer_id, String subscriptionDate, String subscriptionType) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.subscriptionDate = subscriptionDate;
		this.subscriptionType = subscriptionType;
	}
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
