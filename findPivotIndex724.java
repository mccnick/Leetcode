package easy;

public class findPivotIndex724
{
	/*
	 * Given an array of integers nums, calculate the pivot index of this array.
	 *
	 * The pivot index is the index where the sum of all the numbers strictly to the
	 * left of the index is equal to the sum of all the numbers strictly to the
	 * index's right.
	 *
	 * If the index is on the left edge of the array, then the left sum is 0 because
	 * there are no elements to the left. This also applies to the right edge of the
	 * array.
	 *
	 * Return the leftmost pivot index. If no such index exists, return -1.
	 */

	public static int pivotIndex(int[] nums)
	{
		int numsTotal = 0;
		for (int i = 0; i < nums.length; i++)
		{
			numsTotal += nums[i]; // iterate and add up all the indexes = total
		}

		// now add leftSum
		int leftSum = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (i != 0)
			{
				leftSum += nums[i - 1]; // if we aren't at first index, add previous index to leftSum
			}

			// (numsTotal - leftSum = rightSum), subtract another index (pivot)
			// if it's = leftSum, return pivot index
			if (numsTotal - leftSum - nums[i] == leftSum)
			{
				return i; // pivot index found, return
			}
		}
		return -1; // no pivot index found
	}

	public static void main(String[] args)
	{
		int[][] testCases = { 
				{ 1, 7, 3, 6, 5, 6 }, // should return 3
				{ 1, 2, 3 }, // should return -1
				{ 2, 1, -1 }, // should return 0
				{ 0, 0, 0, 0 }, // should return 0
				{ 0, 0, 0, 1 }, // should return 3
		};

		for (int i = 0; i < testCases.length; i++)
		{
			int[] nums = testCases[i];
			int pivotIndex = pivotIndex(nums);
			System.out.printf("Test case %d: %d\n", i + 1, pivotIndex);
		}
	}
	
	/*
	 * -----CONSOLE OUTPUT-----
	 * Test case 1: 3
	 * Test case 2: -1
	 * Test case 3: 0
	 * Test case 4: 0
	 * Test case 5: 3
	 */
	
}
