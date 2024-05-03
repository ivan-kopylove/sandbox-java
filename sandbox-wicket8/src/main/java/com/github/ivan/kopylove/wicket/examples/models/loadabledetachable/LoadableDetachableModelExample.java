package com.github.ivan.kopylove.wicket.examples.models.loadabledetachable;

import com.github.ivan.kopylove.wicket.util.RandomStringGenerator;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

/**
 * Called once per request cycle.
 */
class LoadableDetachableModelExample extends WebPage
{

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        IModel<String> model = new LoadableDetachableModel<String>()
        {
            private static final long serialVersionUID = 8002721754155302356L;

            @Override
            protected String load()
            {
                System.out.println("LoadableDetachableModel called.");
                return RandomStringGenerator.getNext();
                //or db call
            }
        };

        Label message = new Label("message", model);
        message.setOutputMarkupId(true);
        add(message);

        Label message2 = new Label("message2", model);
        message2.setOutputMarkupId(true);
        add(message2);

        AjaxLink<Void> clickMe = new AjaxLink<Void>("ajaxLinkButton")
        {
            private static final long serialVersionUID = -4909033400135111195L;

            @Override
            public void onClick(AjaxRequestTarget target)
            {
                target.add(message);
                target.add(message2);
                System.out.println("Button clicked.");
            }
        };
        add(clickMe);
    }
}
