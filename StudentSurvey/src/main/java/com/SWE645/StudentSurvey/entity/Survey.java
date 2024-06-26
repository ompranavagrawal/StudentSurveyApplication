package com.SWE645.StudentSurvey.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="surveyTable")
public class Survey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@Column(name = "streetAddress", nullable = false)
	private String streetAddress;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "zip", nullable = false)
	private String zip;
	
	@Column(name = "telephone", nullable = false)
	private String telephone;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "dateOfSurvey", nullable = false)
	private String dateOfSurvey;
	
	@Column(name = "students")
	private Boolean students;
	
	@Column(name = "location")
	private Boolean location;
	
	@Column(name = "campus")
	private Boolean campus;
	
	@Column(name = "atmosphere")
	private Boolean atmosphere;
	
	@Column(name = "dormRoom")
	private Boolean dormRoom;
	
	@Column(name = "sports")
	private Boolean sports;
	
	@Column(name = "interestedToUniversity")
	private String interestedToUniversity;
	
	@Column(name = "recommendation")
	private String recommendation;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfSurvey() {
		return dateOfSurvey;
	}
	public void setDateOfSurvey(String dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}
	public Boolean getStudents() {
		return students;
	}
	public void setStudents(Boolean students) {
		this.students = students;
	}
	public Boolean getLocation() {
		return location;
	}
	public void setLocation(Boolean location) {
		this.location = location;
	}
	public Boolean getCampus() {
		return campus;
	}
	public void setCampus(Boolean campus) {
		this.campus = campus;
	}
	public Boolean getAtmosphere() {
		return atmosphere;
	}
	public void setAtmosphere(Boolean atmosphere) {
		this.atmosphere = atmosphere;
	}
	public Boolean getDormRoom() {
		return dormRoom;
	}
	public void setDormRoom(Boolean dormRoom) {
		this.dormRoom = dormRoom;
	}
	public Boolean getSports() {
		return sports;
	}
	public void setSports(Boolean sports) {
		this.sports = sports;
	}
	public String getInterestedToUniversity() {
		return interestedToUniversity;
	}
	public void setInterestedToUniversity(String interestedToUniversity) {
		this.interestedToUniversity = interestedToUniversity;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	
	public Survey() {
	
	}
	
	public Survey(Long id, String firstName, String lastName, String streetAddress, String city, String state,
			String zip, String telephone, String email, String dateOfSurvey, Boolean students, Boolean location,
			Boolean campus, Boolean atmosphere, Boolean dormRoom, Boolean sports, String interestedToUniversity,
			String recommendation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.telephone = telephone;
		this.email = email;
		this.dateOfSurvey = dateOfSurvey;
		this.students = students;
		this.location = location;
		this.campus = campus;
		this.atmosphere = atmosphere;
		this.dormRoom = dormRoom;
		this.sports = sports;
		this.interestedToUniversity = interestedToUniversity;
		this.recommendation = recommendation;
	}
	
	
	
	
}
