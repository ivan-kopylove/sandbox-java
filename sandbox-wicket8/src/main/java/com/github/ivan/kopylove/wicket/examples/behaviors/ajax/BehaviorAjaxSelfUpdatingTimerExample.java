package com.github.ivan.kopylove.wicket.examples.behaviors.ajax;

import com.github.ivan.kopylove.wicket.util.RandomUuidModel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.util.time.Duration;

public class BehaviorAjaxSelfUpdatingTimerExample extends WebPage
{
    private static final long serialVersionUID = 1090726579020985087L;

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        final TextField<String> myTextField = new TextField<>("myTextField", new RandomUuidModel());
        myTextField.add(new org.apache.wicket.ajax.AjaxSelfUpdatingTimerBehavior(Duration.seconds(2)));
        myTextField.setOutputMarkupId(true);

        add(myTextField);
    }
}
