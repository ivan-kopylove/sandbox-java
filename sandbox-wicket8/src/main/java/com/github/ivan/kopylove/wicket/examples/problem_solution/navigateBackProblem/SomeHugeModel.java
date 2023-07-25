package com.github.ivan.kopylove.wicket.examples.problem_solution.navigateBackProblem;

import org.apache.wicket.model.Model;

import java.util.ArrayList;
import java.util.List;

public class SomeHugeModel extends Model<Integer>
{
    public List<Integer> hugeAmountOfData = new ArrayList<Integer>();

    public SomeHugeModel()
    {
        for (int i = 0; i < 10000000; i++)
        {
            hugeAmountOfData.add(i);
        }
        System.out.print("Huge model initialized");
    }
}
