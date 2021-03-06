package com.dn.serverless.customer;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="customer")
public class Customer {
	
	@DynamoDBAutoGeneratedKey
	@DynamoDBHashKey
	private String id;
	
	@DynamoDBAttribute(attributeName="first_name")
	private String firstName;
	
	@DynamoDBAttribute(attributeName="last_name")
	private String lastName;
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String email;

	@DynamoDBAttribute(attributeName="zip_code")
	private String zipCode;

	@DynamoDBAttribute(attributeName="phone_number")
	private String phoneNumber;
	
	

	public Customer() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", address1=").append(address1).append(", address2=").append(address2)
				.append(", city=").append(city).append(", state=").append(state).append(", email=").append(email)
				.append(", zipCode=").append(zipCode).append(", phoneNumber=").append(phoneNumber).append("]");
		return builder.toString();
	}
}
