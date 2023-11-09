package com.github.ivan.kopylove.wicket.examples.behaviors.ajax;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.CallbackParameter;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.util.string.StringValue;

class BehaviorAbstractDefaultAjaxExample4 extends WebPage
{

    private static final long serialVersionUID = 7352203927463159738L;

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        add(new AbstractDefaultAjaxBehavior()
        {
            private static final long serialVersionUID = 4140058103308501910L;

            @Override
            protected void respond(AjaxRequestTarget target)
            {
                StringValue parameterValue = RequestCycle.get()
                                                               .getRequest()
                                                               .getQueryParameters()
                                                               .getParameterValue("yourName");
                System.out.printf("Hello %s%n", parameterValue.toString());
            }

            @Override
            public void renderHead(Component component, IHeaderResponse response)
            {
                super.renderHead(component, response);
                response.render(JavaScriptHeaderItem.forScript(String.format("nameOfFunction=%s",
                                                                             getCallbackFunction(CallbackParameter.explicit(
                                                                                     "yourName"))),
                                                               "CallFromJavascriptBehavior"));
            }
        });
    }
}
