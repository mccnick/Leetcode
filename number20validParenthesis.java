package easy;

import java.util.Stack;

/*
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid. An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Example 1:             Example 2:                Example 3:
 * Input: s = "()"        Input: s = "()[]{}"       Input: s = "(]"
 * Output: true           Output: true              Output: false
 * 
 */

public class number20validParenthesis
{

	public boolean isValid(String s)
	{
		// create a stack to store brackets
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) // iterate string length
		{
			char currentChar = s.charAt(i); // new char value for current s index

			if (currentChar == '(' || currentChar == '[' || currentChar == '{')
			{
				stack.push(currentChar); // valid beginning bracket, push to stack
			}
			else
			{
				if (stack.isEmpty()) // base case checking
				{
					return false; // empty stack, false
				}

				char topChar = stack.pop(); // new char = top most char in stack

				if (currentChar == ')' && topChar != '(') // currently at ) and checking if !top (
				{
					return false; // invalid, it has to be ) currently and ( top stack
				}
				if (currentChar == ']' && topChar != '[') // currently at ] and checking if !top [
				{
					return false; // invalid, it has to be ] currently and [ top stack
				}
				if (currentChar == '}' && topChar != '{') // currently at } and checking if !top {
				{
					return false; // invalid, it has to be } currently and { top stack
				}
			}
		}

		return stack.isEmpty(); // s is valid after iterating & stack empty
	}

//	----- TEST CASES -----
	
	public static void main(String[] args)
	{
		number20validParenthesis solution = new number20validParenthesis();

		String test1 = "()"; String test2 = "()[]{}"; String test3 = "(]";
		String test4 = "([)]"; String test5 = "{[]}";

		System.out.println("Test case 1 (Expected: true): " + solution.isValid(test1));
		System.out.println("Test case 2 (Expected: true): " + solution.isValid(test2));
		System.out.println("Test case 3 (Expected: false): " + solution.isValid(test3));
		System.out.println("Test case 4 (Expected: false): " + solution.isValid(test4));
		System.out.println("Test case 5 (Expected: true): " + solution.isValid(test5));
	}
	
//	----- CONSOLE OUTPUT -----

}
