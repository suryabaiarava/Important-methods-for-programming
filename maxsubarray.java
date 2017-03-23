//maxsubarray solution
//url=https://www.hackerrank.com/challenges/maxsubarray

   
   import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		
		// Get the no of test cases
		final int T = in.nextInt();
		for(int i = 0; i  < T; i++) {
			
		
			int maxSumElems = Integer.MIN_VALUE;
		
			int maxSumOfContiElems = Integer.MIN_VALUE;
			
		
			int sumOfPrevContiElems = 0;//calculates sum till current element
			
		
			final int N = in.nextInt();
			for(int j = 0; j < N; j++) {
				final int elem = in.nextInt();
				
			
				if(sumOfPrevContiElems < 0) {
					sumOfPrevContiElems = 0;
				}
				sumOfPrevContiElems+= elem;//To calculate contigous sum
			//Logic to find non-contigous sum 
				if(elem > 0) {
					if(maxSumElems < 0) {
						maxSumElems = elem;
					} else {
						maxSumElems += elem;
					}
				} else {
					if(maxSumElems < 0) {
						maxSumElems = Math.max(elem, maxSumElems);
					}
				}
				
			}
			
			System.out.println(maxSumOfContiElems + " " + maxSumElems);
		}
		
		in.close();
	}
}
