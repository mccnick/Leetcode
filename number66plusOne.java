package easy;

import java.util.Arrays;

/*
 * 
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 */

public class number66plusOne
{
	public int[] Solution(int[] digits)
	{
		int largeInt = digits.length; // create a new int for the length of array
		for (int i = largeInt - 1; i >= 0; i--) // iterate from the right
		{
			if (digits[i] < 9) // if index is less than 9
			{
				digits[i]++; // increment each index once
				return digits;
			}
			digits[i] = 0; // otherwise set index (9) to 0
		}
		int[] largerArray = new int[largeInt + 1]; // create array copy + 1
		largerArray[0] = 1; // first index = 0
		return largerArray;
	}

// 	----- TEST CASES ------

	public static void main(String[] args)
	{
		plusOne p1 = new plusOne();

		// Test case 1: Normal input
		int[] digits1 = { 1, 2, 3 };
		int[] expectedOutput1 = { 1, 2, 4 };
		int[] actualOutput1 = p1.Solution(digits1);
		System.out.println("Test Case 1 - Actual Output: " + Arrays.toString(actualOutput1) + ", Expected Output: " + Arrays.toString(expectedOutput1));

		// Test case 2: Input with 9 at the end
		int[] digits2 = { 1, 2, 9 };
		int[] expectedOutput2 = { 1, 3, 0 };
		int[] actualOutput2 = p1.Solution(digits2);
		System.out.println("Test Case 2 - Actual Output: " + Arrays.toString(actualOutput2) + ", Expected Output: " + Arrays.toString(expectedOutput2));

		// Test case 3: Input with all 9s
		int[] digits3 = { 9, 9, 9 };
		int[] expectedOutput3 = { 1, 0, 0, 0 };
		int[] actualOutput3 = p1.Solution(digits3);
		System.out.println("Test Case 3 - Actual Output: " + Arrays.toString(actualOutput3) + ", Expected Output: " + Arrays.toString(expectedOutput3));

		// Test case 4: Input with single digit
		int[] digits4 = { 9 };
		int[] expectedOutput4 = { 1, 0 };
		int[] actualOutput4 = p1.Solution(digits4);
		System.out.println("Test Case 4 - Actual Output: " + Arrays.toString(actualOutput4) + ", Expected Output: " + Arrays.toString(expectedOutput4));
	}
	
//	----- CONSOLE OUTPUT -----
//	
//	Test Case 1 - Actual Output: [1, 2, 4], Expected Output: [1, 2, 4]
//	Test Case 2 - Actual Output: [1, 3, 0], Expected Output: [1, 3, 0]
//	Test Case 3 - Actual Output: [1, 0, 0, 0], Expected Output: [1, 0, 0, 0]
//	Test Case 4 - Actual Output: [1, 0], Expected Output: [1, 0]

}
