package com.github.ivan.kopylove.challenges.b8b1a4ce579b46b8b133f306a1aad3fd;

/**
 * <a href="https://leetcode.com/problems/design-parking-system/submissions/990185179/">1603. Design Parking System</a>
 */
class ParkingSystem
{

    private final int[][] slots = new int[3][2];

    public ParkingSystem(int big, int medium, int small)
    {
        slots[0][0] = big;
        slots[1][0] = medium;
        slots[2][0] = small;
    }

    public boolean addCar(int carType)
    {
        if (slots[carType - 1][0] > slots[carType - 1][1])
        {
            slots[carType - 1][1]++;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */