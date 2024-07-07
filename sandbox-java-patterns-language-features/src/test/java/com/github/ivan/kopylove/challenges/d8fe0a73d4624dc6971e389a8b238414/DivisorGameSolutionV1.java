package com.github.ivan.kopylove.challenges.d8fe0a73d4624dc6971e389a8b238414;

/**
 * My best starting (aka naive) attempt — 19 / 40 testcases passed, but the task should be solved using dynamic programming to handle this case
 * <a href="https://leetcode.com/problems/divisor-game/submissions/1258903716/">...</a>
 */
class DivisorGameSolutionV1
{
    public boolean divisorGame(int n)
    {
        boolean aliceTurn = true;

        while (n > 1)
        {
            boolean turned = false;
            for (int x = n - 1; x > 0; x--)
            {
                if (n % x == 0)
                {
                    n = n - x;
                    turned = true;
                    break;
                }
            }
            if (turned)
            {
                aliceTurn = !aliceTurn;
            }
        }

        return !aliceTurn;
    }
}