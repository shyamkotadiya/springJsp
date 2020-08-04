package com.Spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetailtable")
public class UserDetailTable  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*public UserDetailTable() {
		
	}

	public UserDetailTable(Integer userDetailId, String firstName, String lastName, String gender, String hobbies) {
		super();
		this.userDetailId = userDetailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hobbies = hobbies;
	}*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userDetailId;

	private String firstName;

	private String lastName;

	private String gender;

	private String hobbies;

	public Integer getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(Integer userDetailId) {
		this.userDetailId = userDetailId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + gender + " " + hobbies;
	}

}
