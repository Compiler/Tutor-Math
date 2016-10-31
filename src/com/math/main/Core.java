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
		
		Calculator calc = new Calculator();
		
		int x = 8;
		int y = 2;
		
		System.out.println(x + " + " + y + " = " + calc.sum(x, y));
		System.out.println(x + " * " + y + " = " + calc.multiply(x, y));
		System.out.println(x + " / " + y + " = " + calc.divide(x, y));
		System.out.println(x + " - " + y + " = " + calc.subtract(x, y));
		
	}

}
