package com.github.ivan.kopylove.wicket.examples.problem_solution.navigateBackProblem;

import org.apache.wicket.markup.html.panel.Panel;

class SomeComponent extends Panel
{
    public SomeComponent(String id, SomeHugeModel model)
    {
        super(id, model);
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();
        setResponsePage(new AnotherPage(getPage().getPageReference()));
    }
}
