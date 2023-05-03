package easy;

import java.util.Arrays;

public class runningSumArray
{
	/*
	* Given an array nums. We define a running sum of an array as runningSum[i] =
	* sum(nums[0]…nums[i]).
	* 
	* Return the running sum of nums.
	*/
	
	public static int[] runningSum(int[] nums)
	{
		for (int i = 1; i < nums.length; i++)
		{
			nums[i] += nums[i - 1]; // nums[] += current index plus previous
		}
		return nums;
	}

	// -----TEST CASES-----

	public static void main(String[] args)
	{
		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] result1 = runningSum(nums1);
		System.out.println(Arrays.toString(result1)); // should print [1, 3, 6, 10, 15]

		int[] nums2 = { 0, 0, 0, 0, 0 };
		int[] result2 = runningSum(nums2);
		System.out.println(Arrays.toString(result2)); // should print [0, 0, 0, 0, 0]

		int[] nums3 = { 2, 4, 6, 8, 10 };
		int[] result3 = runningSum(nums3);
		System.out.println(Arrays.toString(result3)); // should print [2, 6, 12, 20, 30]

		int[] nums4 = { -1, 0, 1 };
		int[] result4 = runningSum(nums4);
		System.out.println(Arrays.toString(result4)); // should print [-1, -1, 0]

		int[] nums5 = { 1 };
		int[] result5 = runningSum(nums5);
		System.out.println(Arrays.toString(result5)); // should print [1]
	}
	
	/*
	 * CONSOLE OUTPUT:
	 * 
	 * [1, 3, 6, 10, 15]
	 * [0, 0, 0, 0, 0]
	 * [2, 6, 12, 20, 30]
	 * [-1, -1, 0]
	 * [1]
	 *
	 */

}
