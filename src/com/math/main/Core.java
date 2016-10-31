package com.math.main;

public class Core {
	
	
	/**
	 * git add -A
	 * 
	 * git commit -m "your update message"
	 * 
	 * git push origin master
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.speak();
		cat.speak();
		
		
	}

}
