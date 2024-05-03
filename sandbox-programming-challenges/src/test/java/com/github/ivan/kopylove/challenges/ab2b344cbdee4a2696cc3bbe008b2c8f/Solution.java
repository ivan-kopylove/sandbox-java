package com.github.ivan.kopylove.challenges.ab2b344cbdee4a2696cc3bbe008b2c8f;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/475035110/">240. Search a 2D Matrix II</a>
 */
class Solution
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int row = 0;
        int col = matrix[0].length - 1 >= 0 ? matrix[0].length - 1 : 0;

        while (col >= 0 && row <= matrix.length - 1)
        {

            if (target == matrix[row][col])
            {
                return true;
            }
            else if (target > matrix[row][col])
            {
                row++;
            }
            else if (target < matrix[row][col])
            {
                col--;
            }
        }

        return false;
    }
}