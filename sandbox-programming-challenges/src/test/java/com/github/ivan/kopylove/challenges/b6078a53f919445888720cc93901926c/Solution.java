package com.github.ivan.kopylove.challenges.b6078a53f919445888720cc93901926c;

/**
 * <a href="https://leetcode.com/problems/number-of-laser-beams-in-a-bank/submissions/990974697/">2125. Number of Laser Beams in a Bank</a>
 */
class Solution
{
    public int numberOfBeams(String[] bank)
    {
        int result = 0;

        long previousFloorDevices = 0;
        for (String floor : bank)
        {
            long floorDevices = floor.chars()
                                     .filter(c -> (char) c == '1')
                                     .count();
            if (floorDevices > 0)
            {
                result += floorDevices * previousFloorDevices;
                previousFloorDevices = floorDevices;
            }
        }

        return result;
    }
}