package com.quickxpert.springbootmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int id;
     private String firstname;
     private String middlename;
     private String lastname;
     private int age;
     
     
     public Employee()
     {
    	 super();
     }
     
     public Employee(int id,String firstname, String middlename, String lastname, int age)
     {
    	 super();
    	 this.id=id;
    	 this.firstname=firstname;
    	 this.middlename=middlename;
    	 this.lastname=lastname;
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     
     
}
