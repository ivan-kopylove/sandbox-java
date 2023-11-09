package com.github.ivan.kopylove.wicket.examples.problem_solution.navigateBackProblem;

import org.apache.wicket.markup.html.WebPage;

class SomePage extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();
        SomeComponent someComp = new SomeComponent("someComponent", new SomeHugeModel());
        add(someComp);
    }
}
