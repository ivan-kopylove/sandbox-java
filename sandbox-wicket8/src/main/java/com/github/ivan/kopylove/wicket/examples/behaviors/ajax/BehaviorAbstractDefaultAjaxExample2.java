package com.github.ivan.kopylove.wicket.examples.behaviors.ajax;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.http.WebRequest;
import org.apache.wicket.util.string.StringValue;

class BehaviorAbstractDefaultAjaxExample2 extends WebPage
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
                RequestCycle cycle = RequestCycle.get();
                WebRequest webRequest = (WebRequest) cycle.getRequest();
                StringValue param1 = webRequest.getQueryParameters()
                                               .getParameterValue("param1");
                StringValue param2 = webRequest.getQueryParameters()
                                               .getParameterValue("param2");
                System.out.println(param1);
                System.out.println(param2);
                // do whatever you need with param1 and param2
            }

            @Override
            public void renderHead(Component component, IHeaderResponse response)
            {
                super.renderHead(component, response);
                String script = "var param1Value = '123';";
                script += "var param2Value = '456';";
                script += getCallbackScript();
                script = script.replace("\"PARAM_PLACEHOLDER_1\"", "param1Value"); //remove quotes
                script = script.replace("\"PARAM_PLACEHOLDER_2\"", "param2Value"); //remove quotes
                response.render(OnDomReadyHeaderItem.forScript(script));
            }

            @Override
            protected void updateAjaxAttributes(AjaxRequestAttributes attributes)
            {
                super.updateAjaxAttributes(attributes);
                attributes.getExtraParameters()
                          .put("param1", "PARAM_PLACEHOLDER_1");
                attributes.getExtraParameters()
                          .put("param2", "PARAM_PLACEHOLDER_2");
            }
        });
    }
}
