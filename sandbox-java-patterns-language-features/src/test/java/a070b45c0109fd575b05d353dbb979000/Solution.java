package a070b45c0109fd575b05d353dbb979000;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/submissions/449358581/">11. Container With Most Water</a>
 */
class Solution
{
    public int maxArea(int[] height)
    {
        //paper: https://imgur.com/a/xi69lzH
        //idea #1: find biggestSide, find biggestBottomLength and multiply (failed)
        //idea #2: multiply current height by max bottom or max height (failed)
        //idea #3: two pointers idea (from the solution section, without glancing the code).
        int maxArea = 0;

        int currentLeftIndex = 0;
        int currentRightIndex = height.length - 1;

        int currentRightHeight = height[currentRightIndex];
        int currentLeftHeight = height[currentLeftIndex];
        int currentBottomHeight = 0;

        int maxLeftHeight = currentLeftHeight;
        int maxRightHeight = currentRightHeight;

        while (currentLeftIndex != currentRightIndex)
        {
            currentBottomHeight = currentRightIndex - currentLeftIndex;

            int result = 0;
            if (currentLeftHeight <= currentRightHeight)
            {
                result = currentLeftHeight * currentBottomHeight;
            }
            else
            {
                result = currentRightHeight * currentBottomHeight;
            }

            maxArea = Math.max(maxArea, result);

            if (currentLeftHeight <= currentRightHeight)
            {
                currentLeftHeight = height[++currentLeftIndex];
            }
            else
            {
                currentRightHeight = height[--currentRightIndex];
            }
        }

        return maxArea;
    }
}
