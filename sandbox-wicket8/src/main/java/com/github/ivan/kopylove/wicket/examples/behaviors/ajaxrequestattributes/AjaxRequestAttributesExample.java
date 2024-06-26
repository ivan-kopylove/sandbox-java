package com.github.ivan.kopylove.wicket.examples.behaviors.ajaxrequestattributes;

import com.github.ivan.kopylove.wicket.examples.behaviors.other.BehaviorFactory;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

class AjaxRequestAttributesExample extends WebPage
{
    private static final long serialVersionUID = 7352203927463159738L;

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        TextField<String> myTextField = new TextField<>("myTextField", Model.of("1"));
        myTextField.setOutputMarkupId(true);
        myTextField.add(BehaviorFactory.get());
        add(myTextField);
    }
}
