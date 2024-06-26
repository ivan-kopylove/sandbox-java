package com.github.ivan.kopylove.wicket.examples.components.radiochoice;

import com.github.ivan.kopylove.wicket.util.MyChoiceRenderer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;

import java.util.Arrays;
import java.util.List;

class RadioChoiceRenderer extends WebPage
{
    private static final List<String> TYPES = Arrays.asList("Shared Host", "VPS", "Dedicated Server");

    private static final long serialVersionUID = -1923626121356192574L;

    private final String selected = null;

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        add(new FeedbackPanel("feedback"));

        RadioChoice<String> hostingType = new RadioChoice<String>("hosting",
                                                                  new PropertyModel<String>(this, "selected"),
                                                                  TYPES,
                                                                  new MyChoiceRenderer());

        Form<?> form = new Form<Void>("form")
        {
            private static final long serialVersionUID = -5672719273595835054L;

            @Override
            protected void onSubmit()
            {
                info("Selected Type : " + selected);
            }
        };

        add(form);
        form.add(hostingType);
    }
}
