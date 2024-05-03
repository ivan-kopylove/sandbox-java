package com.github.ivan.kopylove.challenges.bd9c0db77f18444caab7ed2c5eb5d159;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext())
        {
            try
            {
                int n = scanner.nextInt();
                if (n % 6 == 0)
                {
                    sum += n;
                }
            }
            catch (Exception e)
            {
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
