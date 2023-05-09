package easy;

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

//
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
//
// For example, 2 is written as II in Roman numeral, just two ones added together.
// 12 is written as XII, which is simply X + II.
// The number 27 is written as XXVII, which is XX + V + II.
//
// Roman numerals are usually written largest to smallest from left to right.
// However, the numeral for four is not IIII. Instead, the number four is written as IV.
// Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX.
// There are six instances where subtraction is used:
//
// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.
//
// Examples:
//
//	Input: s = "III"              Input: s = "LVIII"                       Input: s = "MCMXCIV"
//	Output: 3                     Output: 58                               Output: 1994
//	Explanation: III = 3.         Explanation: L = 50, V= 5, III = 3.      Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

public class number13romanToInteger
{

	public int romanToInt(String s)
	{
		int Integer = 0, subtract = 0; // initialize

		for (int i = 0; i < s.length(); i++) // iterate
		{
			char c = s.charAt(i); // c index of s
			switch (c) // switch case for each roman numeral at index c
			{
			case 'I':
				// Checking for subtractive cases IV (4) and IX (9)
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
				{
					subtract++;
				}
				else
				{
					Integer++;
				}
				break;

			case 'V':
				Integer += 5;
				break;

			case 'X':
				// Checking for subtractive cases XL (40) and XC (90)
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
				{
					subtract += 10;
				}
				else
				{
					Integer += 10;
				}
				break;

			case 'L':
				Integer += 50;
				break;

			case 'C':
				// Checking for subtractive cases CD (400) and CM (900)
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
				{
					subtract += 100;
				}
				else
				{
					Integer += 100;
				}
				break;

			case 'D':
				Integer += 500;
				break;

			case 'M':
				Integer += 1000;
				break;
			}
		}

		return Integer - subtract; // we return incremented Integer value minus the incremented subtract value

	}

//	----- TEST CASES -----                                                       ------ CONSOLE OUTPUT ------
	
	public static void main(String[] args)
	{
		number13romanToInteger solution = new number13romanToInteger();
		
		System.out.println(solution.romanToInt("III"));                         //     3
		System.out.println(solution.romanToInt("LVIII"));                       //     58
		System.out.println(solution.romanToInt("MCMXCIV"));                     //     1994
		System.out.println(solution.romanToInt("MMMDCCCLXXXVIII"));             //     3888
		System.out.println(solution.romanToInt("CDXLIV"));                      //     444
		System.out.println(solution.romanToInt("IIIMMMCCDDX"));                 //     4013
		System.out.println(solution.romanToInt("XXIV"));                        //     24 
		System.out.println(solution.romanToInt("IV"));                          //     4
		System.out.println(solution.romanToInt("IX"));                          //     9
		
	}
}
