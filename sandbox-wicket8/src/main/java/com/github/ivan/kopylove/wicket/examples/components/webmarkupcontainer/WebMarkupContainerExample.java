package com.github.ivan.kopylove.wicket.examples.components.webmarkupcontainer;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Purpose of this example:  to show usage of {@link WebMarkupContainer}
 * Complexity: low
 */
class WebMarkupContainerExample extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();
        WebMarkupContainer markupContainer = new WebMarkupContainer("markupContainer")
        {
            @Override
            protected void onConfigure()
            {
                super.onConfigure();
                setVisible(false);
            }
        };

        markupContainer.add(new Label("spanId", "myText"));
        add(markupContainer);
    }
}
