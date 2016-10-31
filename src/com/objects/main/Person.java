package com.objects.main;

public class Person {
	
	
	
	private String myName;
	
	/**
	 * this is the constructor
	 * @param name
	 */
	public Person(String name){
		
		
		this.myName = name;
		
	}
	
	
	/*
	 * this method prints the myName variable
	 */
	public void speakName(){
		
		System.out.println("My name is " + myName);
		
	}

}
