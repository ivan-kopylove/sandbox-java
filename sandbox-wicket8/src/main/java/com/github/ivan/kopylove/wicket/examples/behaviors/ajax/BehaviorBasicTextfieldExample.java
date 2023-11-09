package com.github.ivan.kopylove.wicket.examples.behaviors.ajax;

import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

/**
 * Purpose of this example: to show how Wicket Behaviour works
 * Level of understanding: beginner
 * Complexity: low
 */
class BehaviorBasicTextfieldExample extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        TextField<String> myTextField = new TextField<String>("myTextField", Model.of("text field"));
        myTextField.add(new AjaxEventBehavior("onclick")
        {
            private static final long serialVersionUID = -7872335862420393072L;

            @Override
            protected void onEvent(AjaxRequestTarget target)
            {
                System.out.println("AjaxEventBehavior - onclick");
                target.add(myTextField);
            }
        });

        add(myTextField);
    }
}
