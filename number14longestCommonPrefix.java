package easy;

public class number14longestCommonPrefix
{

//	Write a function to find the longest common prefix string amongst an array of strings.
//	If there is no common prefix, return an empty string "".

//	----- Examples -----
//	Input: strs = ["flower","flow","flight"]
//	Output: "fl"
//		
//	Input: strs = ["dog","racecar","car"]
//	Output: ""
//	Explanation: There is no common prefix among the input strings.

	public String longestCommonPrefix(String[] strs)
	{
		// base case check
		if (strs.length == 0)
		{
			return "";
		}

		String newString = strs[0]; // new string for first index of string array
		for (int i = 0; i < strs.length; i++) // iterating through string array
		{
			while (strs[i].indexOf(newString) != 0) // checking each index, except first index
			{
				newString = newString.substring(0, newString.length() - 1); // remove last letter til matching
			}
		}
		return newString;

	}

//	----- TEST CASES -----

	public static void main(String[] args)
	{
		number14longestCommonPrefix solution = new number14longestCommonPrefix();
		System.out.println(solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
		System.out.println(solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
		System.out.println(solution.longestCommonPrefix(new String[] { "apple", "app", "application" }));
		System.out.println(solution.longestCommonPrefix(new String[] { "alpha", "alphabet", "alphanumeric" }));
		System.out.println(solution.longestCommonPrefix(new String[] { "ball", "balloon", "basket" }));
	}

//	----- CONSOLE OUTPUT -----
//	fl
//
//	app
//	alpha
//	ba

}
