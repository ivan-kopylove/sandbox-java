package heap.a1ce493a5484e23ae147200604d477952;

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
