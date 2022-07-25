package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;


	@Entity
	public class Customer {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		

		private String name;

		private Long age;

		private String height;

		private String religion;
		
		private String caste;
		private String maritalStatus;

		private String city;
		
	    private String motherTongue;

		private String complexion;

		private String weight;

		private String bloodGroup;

		private String diet;//vegetarian or non-vegetarian

		private String education;
	    private String familyMembers;
		private String fatherOccupation;
		private String motherOccupation;
		private String occupation;
		private int annualIncome;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getAge() {
			return age;
		}
		public void setAge(Long age) {
			this.age = age;
		}
		public String getHeight() {
			return height;
		}
		public void setHeight(String height) {
			this.height = height;
		}
		public String getReligion() {
			return religion;
		}
		public void setReligion(String religion) {
			this.religion = religion;
		}
		public String getCaste() {
			return caste;
		}
		public void setCaste(String caste) {
			this.caste = caste;
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getMotherTongue() {
			return motherTongue;
		}
		public void setMotherTongue(String motherTongue) {
			this.motherTongue = motherTongue;
		}
		public String getComplexion() {
			return complexion;
		}
		public void setComplexion(String complexion) {
			this.complexion = complexion;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		public String getDiet() {
			return diet;
		}
		public void setDiet(String diet) {
			this.diet = diet;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public String getFamilyMembers() {
			return familyMembers;
		}
		public void setFamilyMembers(String familyMembers) {
			this.familyMembers = familyMembers;
		}
		public String getFatherOccupation() {
			return fatherOccupation;
		}
		public void setFatherOccupation(String fatherOccupation) {
			this.fatherOccupation = fatherOccupation;
		}
		public String getMotherOccupation() {
			return motherOccupation;
		}
		public void setMotherOccupation(String motherOccupation) {
			this.motherOccupation = motherOccupation;
		}
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public int getAnnualIncome() {
			return annualIncome;
		}
		public void setAnnualIncome(int annualIncome) {
			this.annualIncome = annualIncome;
		}
		public Customer(Long id, String name, Long age, String height, String religion, String caste,
				String maritalStatus, String city, String motherTongue, String complexion, String weight,
				String bloodGroup, String diet, String education, String familyMembers, String fatherOccupation,
				String motherOccupation, String occupation, int annualIncome) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.height = height;
			this.religion = religion;
			this.caste = caste;
			this.maritalStatus = maritalStatus;
			this.city = city;
			this.motherTongue = motherTongue;
			this.complexion = complexion;
			this.weight = weight;
			this.bloodGroup = bloodGroup;
			this.diet = diet;
			this.education = education;
			this.familyMembers = familyMembers;
			this.fatherOccupation = fatherOccupation;
			this.motherOccupation = motherOccupation;
			this.occupation = occupation;
			this.annualIncome = annualIncome;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

}
