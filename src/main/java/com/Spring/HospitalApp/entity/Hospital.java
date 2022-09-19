package com.Spring.HospitalApp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.Spring.HospitalApp.Service.HospitalServiceImpl;

@Entity
public class Hospital {
	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;
	private int age;

	public Hospital(long id, String firstName, String lastName, int age) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Hospital() {

	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	public void saveHospital(HospitalServiceImpl hospitalServiceImpl) {
		hospitalServiceImpl.hospitalrepo.saveHospital(hospitalServiceImpl, this);
	}

	//public void saveHospital(HospitalServiceImpl hospitalServiceImpl) {
    	//hospitalServiceImpl.saveHospital(this);
    //}

    public static List<Hospital> findAllHospitals() {
		return null;
	}

    public static void saveHospital(Hospital hospital) {
    }

    public static void deleteHospital(long id2) {
    }

}

