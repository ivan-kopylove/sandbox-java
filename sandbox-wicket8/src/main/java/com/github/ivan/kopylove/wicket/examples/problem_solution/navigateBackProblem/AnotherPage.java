package com.github.ivan.kopylove.wicket.examples.problem_solution.navigateBackProblem;

import org.apache.wicket.Page;
import org.apache.wicket.PageReference;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;

public class AnotherPage extends WebPage
{
    private PageReference previousPageReference;

    public AnotherPage(PageReference previousPageReference)
    {
        this.previousPageReference = previousPageReference;
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();
        add(new AjaxLink<Void>("navigateback")
        {

            @Override
            public void onClick(AjaxRequestTarget target)
            {
                Page prevPage = previousPageReference.getPage();
                if (prevPage != null)
                {
                    setResponsePage(prevPage);
                }
                else
                {
                }
            }
        });
    }
}
