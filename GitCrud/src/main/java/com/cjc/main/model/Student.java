package com.cjc.main.model;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private int rollno;
	 private String name;
	 private String address;
	 private String email;
	 private long mobileno;
	
	 

}
