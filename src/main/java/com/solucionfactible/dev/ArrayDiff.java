package com.solucionfactible.dev;
import java.util.Arrays;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {
		for(int i : b) {
			a = Arrays.stream(a).filter(x -> x != i).toArray();
		}
		return a;
	}
}
