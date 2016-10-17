package com.cisc181.core;

public class PersonException extends Exception {
	private Person person;
	public Person Getperson(){
		return person;
		
	}
	public void PersonException(Person person){
		this.person=person;
	}
	
}
