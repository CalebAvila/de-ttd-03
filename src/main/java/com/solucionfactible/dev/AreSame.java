package com.solucionfactible.dev;
import java.util.Arrays;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		boolean res = true;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i < a.length; i++) {
			if(!(a[i]*a[i] == b[i])) {
				res = false;
				break;
			}
		}
		return res;
	}

}
