package com.github.ivan.kopylove.challenges.a8ac2471703348b19e6ca171c44ae759;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/spiral-matrix/submissions/446272528/">54. Spiral Matrix</a>
 */
class Solution
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> result = new ArrayList<>();

        //each turn limits opposite side's border by 1 cell
        int topBorderShift = 0;
        int rightBorderShift = 0;
        int bottomBorderShift = 0;
        int leftBorderShift = 0;

        //0 - right
        //1 - down
        //2 - left
        //3 - up
        int currentDirection = 0;

        //matrix[column][row];

        while (true)
        {
            if (currentDirection == 0)
            {
                if (leftBorderShift + rightBorderShift >= matrix[0].length)
                {
                    break;
                }
                for (int i = leftBorderShift; i < matrix[0].length - rightBorderShift; i++)
                {
                    result.add(matrix[leftBorderShift][i]);
                }
                currentDirection++;
                topBorderShift++;
            }

            if (currentDirection == 1)//down
            {
                if (topBorderShift + bottomBorderShift >= matrix.length)
                {
                    break;
                }

                for (int i = topBorderShift; i < matrix.length - bottomBorderShift; i++)
                {
                    result.add(matrix[i][matrix[i].length - rightBorderShift - 1]);
                }
                currentDirection++;
                rightBorderShift++;
            }

            if (currentDirection == 2)//leftwards
            {
                if (leftBorderShift + rightBorderShift >= matrix[0].length)
                {
                    break;
                }

                for (int i = matrix[0].length - rightBorderShift - 1; i >= leftBorderShift; i--)
                {
                    result.add(matrix[matrix.length - bottomBorderShift - 1][i]);
                }
                currentDirection++;
                bottomBorderShift++;
            }

            if (currentDirection == 3)//upwards
            {
                if (topBorderShift + bottomBorderShift >= matrix.length)
                {
                    break;
                }

                for (int i = matrix.length - bottomBorderShift - 1; i >= topBorderShift; i--)
                {
                    result.add(matrix[i][leftBorderShift]);
                }
                currentDirection = 0;
                leftBorderShift++;
            }
        }

        return result;
    }
}