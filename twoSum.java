package leetcodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target. - You may assume that each input
 * would have exactly one solution, and you may not use the same element twice.
 * - You can return the answer in any order.
 */

public class twoSum
{
	public static int[] twoSumSolution(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<>(); // new hashmap
		for (int i = 0; i < nums.length; i++) // iterate length of nums array
		{
			int complement = target - nums[i]; // new variable
			if (map.containsKey(complement))
			{
				return new int[] { map.get(complement), i }; // return new int complement index in array and the iteration i
			}
			map.put(nums[i], i); // map doesnt contain complement, add nums[i] and i to map
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	// test cases

	public static void main(String[] args)
	{
		int[] nums1 = { 2, 7, 11, 15 };
		int target1 = 9;
		int[] result1 = twoSumSolution(nums1, target1); // run method with these variables
		System.out.println(Arrays.toString(result1)); // [0, 1] 2 + 7 add up to 9

		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;
		int[] result2 = twoSumSolution(nums2, target2); // run method with these variables
		System.out.println(Arrays.toString(result2)); // [1, 2] 2 + 4 add up to 6

		int[] nums3 = { 3, 3 };
		int target3 = 6;
		int[] result3 = twoSumSolution(nums3, target3); // run method with these variables
		System.out.println(Arrays.toString(result3)); // [0, 1] 3 + 3 add up to 6 etc
	}
	
	/*
	 * -----CONSOLE OUTPUT-----
	 * [0, 1]
	 * [1, 2]
	 * [0, 1]
	 */
}
