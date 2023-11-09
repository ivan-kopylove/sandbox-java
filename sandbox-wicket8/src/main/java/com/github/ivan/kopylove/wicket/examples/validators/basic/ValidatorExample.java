package com.github.ivan.kopylove.wicket.examples.validators.basic;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.validation.validator.EmailAddressValidator;

/**
 * Check html output. On falied validation wicked adds "error" class thanks to {@link ErrorIndicatorBehavior}
 */
class ValidatorExample extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        Form<?> form = new Form("form")
        {
            private static final long serialVersionUID = 4742924626390708189L;

            @Override
            protected void onSubmit()
            {
                super.onSubmit();
            }

            @Override
            protected void onError()
            {
                super.onError();
            }
        };
        form.setOutputMarkupId(true);

        TextField<String> myTextField = new TextField<>("myTextField", Model.of("test"));
        myTextField.add(EmailAddressValidator.getInstance());
        myTextField.add(new ErrorIndicatorBehavior());
        myTextField.setOutputMarkupId(true);
        form.add(myTextField);
        add(form);
    }
}
