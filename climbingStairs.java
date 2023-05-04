package easy;

/*
 * #70
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * 
 * Example:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 */

public class climbingStairs
{

	public int climbStairs(int n)
	{
		if (n == 1)
		{
			return n; // if 1 just return 1
		}
		int step1 = 1;
		int step2 = 2; // can only take 1 or 2 steps at most
		for (int i = 3; i <= n; i++) // iterate to n starting at 3
		{
			int newStep = step2; // step2 copy
			step2 = step1 + step2; // new value for step2
			step1 = newStep;
		}
		return step2;
	}

//	----- TEST CASES -----

	public static void main(String[] args)
	{
		climbingStairs obj = new climbingStairs();

		// Test case 1: n = 2, expected output = 2
		int n1 = 2;
		int expectedOutput1 = 2;
		int result1 = obj.climbStairs(n1);
		if (result1 == expectedOutput1)
		{
			System.out.println("Test case 1 (n = " + n1 + "): Passed. Expected Output: " + expectedOutput1
					+ ". Actual Output: " + result1);
		}
		else
		{
			System.out.println("Test case 1 (n = " + n1 + "): Failed");
		}

		// Test case 2: n = 3, expected output = 3
		int n2 = 3;
		int expectedOutput2 = 3;
		int result2 = obj.climbStairs(n2);
		if (result2 == expectedOutput2)
		{
			System.out.println("Test case 1 (n = " + n2 + "): Passed. Expected Output: " + expectedOutput2
					+ ". Actual Output: " + result2);

		}
		else
		{
			System.out.println("Test case 2 (n = " + n2 + "): Failed");
		}

		// Test case 3: n = 4, expected output = 5
		int n3 = 4;
		int expectedOutput3 = 5;
		int result3 = obj.climbStairs(n3);
		if (result3 == expectedOutput3)
		{
			System.out.println("Test case 1 (n = " + n3 + "): Passed. Expected Output: " + expectedOutput3
					+ ". Actual Output: " + result3);

		}
		else
		{
			System.out.println("Test case 3 (n = " + n3 + "): Failed");
		}

		// Test case 4: n = 1, expected output = 1
		int n4 = 1;
		int expectedOutput4 = 1;
		int result4 = obj.climbStairs(n4);
		if (result4 == expectedOutput4)
		{
			System.out.println("Test case 1 (n = " + n4 + "): Passed. Expected Output: " + expectedOutput4
					+ ". Actual Output: " + result4);

		}
		else
		{
			System.out.println("Test case 4 (n = " + n4 + "): Failed");
		}

		// Test case 5: n = 5, expected output = 8
		int n5 = 5;
		int expectedOutput5 = 8;
		int result5 = obj.climbStairs(n5);
		if (result5 == expectedOutput5)
		{
			System.out.println("Test case 1 (n = " + n5 + "): Passed. Expected Output: " + expectedOutput5
					+ ". Actual Output: " + result5);

		}
		else
		{
			System.out.println("Test case 5 (n = " + n5 + "): Failed");
		}

	}

//	----- CONSOLE OUTPUT -----
//	
//	Test case 1 (n = 2): Passed. Expected Output: 2. Actual Output: 2
//	Test case 1 (n = 3): Passed. Expected Output: 3. Actual Output: 3
//	Test case 1 (n = 4): Passed. Expected Output: 5. Actual Output: 5
//	Test case 1 (n = 1): Passed. Expected Output: 1. Actual Output: 1
//	Test case 1 (n = 5): Passed. Expected Output: 8. Actual Output: 8

}
