package com.solucionfactible.dev;
import java.util.Arrays;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array) {
		char res = ' ';
		char[] alphabet = new char[] {
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
		};
		int first = new String(alphabet).indexOf(array[0]);
		int last = new String(alphabet).indexOf(array[array.length - 1]);
		char[] newArray = Arrays.copyOfRange(alphabet, first, last);
		for(int i = 0; i < array.length; i++) {
			if(newArray[i] != array[i]) {
				res = newArray[i];
				break;
			}
		}
		return res;
	}

}
