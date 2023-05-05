package leetcodePractice;

public class numberOfIslands200
{

	/*
	 * *****MEDIUM*****
	 * 
	 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and
	 * '0's (water), return the number of islands.
	 * 
	 * An island is surrounded by water and is formed by connecting adjacent lands
	 * horizontally or vertically. You may assume all four edges of the grid are all
	 * surrounded by water.
	 * 
	 * Constraints:
	 * 
	 * m == grid.length
	 * 
	 * n == grid[i].length
	 * 
	 * 1 <= m, n <= 300
	 * 
	 * grid[i][j] is '0' or '1'.
	 * 
	 */

	public int numIslands(char[][] grid)
	{
		int islands = 0;

		// iterate thru the width and height of 2D array
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{

				if (grid[i][j] == '1') // char 2D array, not INT!!
				{
					// found a 1, increment island
					islands++;

					// create a breadth first search recursive method to call this
					callBFS(grid, i, j);

				}

			}
		}
		return islands;
	}

	private void callBFS(char[][] grid, int i, int j)
	{
		// boundary check first
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
		{
			return; // breaks out of recursion
		}

		// set any additional 1's to a 0 for now, remember not int, CHAR!!!
		grid[i][j] = '0'; 

		// call the method for up, down, left, right
		callBFS(grid, i + 1, j);
		callBFS(grid, i - 1, j);
		callBFS(grid, i, j - 1);
		callBFS(grid, i, j + 1);
	}

	// -------------------- chatGPT QUICK TESTS --------------------

	public static void main(String[] args)
	{
		numberOfIslands solution = new numberOfIslands();

		char[][] grid1 = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		int expected1 = 1;
		int actual1 = solution.numIslands(grid1);
		System.out.println("Test case 1 - Expected: " + expected1 + ", Actual: " + actual1);

		char[][] grid2 = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		int expected2 = 3;
		int actual2 = solution.numIslands(grid2);
		System.out.println("Test case 2 - Expected: " + expected2 + ", Actual: " + actual2);

		char[][] grid3 = { { '1', '1', '1' }, { '0', '1', '0' }, { '1', '1', '1' } };
		int expected3 = 1;
		int actual3 = solution.numIslands(grid3);
		System.out.println("Test case 3 - Expected: " + expected3 + ", Actual: " + actual3);

		char[][] grid4 = { { '1', '1', '1', '1', '1' }, { '1', '1', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '1', '1', '1', '1' }, { '1', '1', '1', '1', '1' } };
		int expected4 = 1;
		int actual4 = solution.numIslands(grid4);
		System.out.println("Test case 4 - Expected: " + expected4 + ", Actual: " + actual4);

		char[][] grid5 = { { '0', '0', '0', '0', '0' }, { '0', '0', '0', '0', '0' }, { '0', '0', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		int expected5 = 0;
		int actual5 = solution.numIslands(grid5);
		System.out.println("Test case 5 - Expected: " + expected5 + ", Actual: " + actual5);
	}

	/*
	 * CONSOLE OUTPUT:
	 * 
	 * Test case 1 - Expected: 1, Actual: 1
	 * Test case 2 - Expected: 3, Actual: 3
	 * Test case 3 - Expected: 1, Actual: 1
	 * Test case 4 - Expected: 1, Actual: 1
	 * Test case 5 - Expected: 0, Actual: 0
	 * 
	 * it works, done
	 */

}
