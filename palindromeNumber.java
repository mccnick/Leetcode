package easy;

public class palindromeNumber
{

	/*
	 * Given an integer x, return true if x is a palindrome , and false otherwise.
	 */

	public boolean isPalindrome(int x)
	{
		// begin with base cases

		if (x == 0)
		{
			return true; // 0 is a palindrome
		}

		if (x < 0 || x % 10 == 0) // can't be negative or even
		{
			return false;
		}

		int reversedInt = 0; // reversed int holding value
		while (x > reversedInt)
		{
			int newInt = x % 10; // new int for right most index of x
			x /= 10; // removing it from x, (ex 121/10 = 12, it removes rightmost digit)
			reversedInt = (reversedInt * 10) + newInt; // add rightmost int to reversedInt
		}

		// palindrome check
		if (x == reversedInt || x == reversedInt / 10)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

//	----- TEST CASES -----

	public static void main(String[] args)
	{
		int[] testCases = { 0, 123, 121, 12321, -123, 123321, 10, 567898765 };
		palindromeNumber pn = new palindromeNumber();
		for (int i = 0; i < testCases.length; i++)
		{
			boolean result = pn.isPalindrome(testCases[i]);
			System.out.printf("Test case %d (%d): %s\n", i + 1, testCases[i], result);
		}
	}

//	-----CONSOLE OUTPUT-----
//	Test case 1 (0): true
//	Test case 2 (123): false
//	Test case 3 (121): true
//	Test case 4 (12321): true
//	Test case 5 (-123): false
//	Test case 6 (123321): true
//	Test case 7 (10): false
//	Test case 8 (567898765): true

}
