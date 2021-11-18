package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	public static int persistence(long num) {
		int cont = 0;
		String str; 
		String[] arr;
		long mult = 1;
		while(num > 9) {
			cont++;
			str = Long.toString(num);
			arr = str.split("");
			for(String n : arr) {
				mult = mult * Long.parseLong(n);
			}
			num = mult;
			mult = 1;
		}
		return cont;
	}

}
