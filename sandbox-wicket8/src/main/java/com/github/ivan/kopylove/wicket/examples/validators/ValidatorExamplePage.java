package com.github.ivan.kopylove.wicket.examples.validators;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;

class ValidatorExamplePage extends WebPage
{
    private static final long serialVersionUID = 7132129081649580796L;

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        TextField<String> someTextField = new TextField<String>("someTextField", Model.of(""));
        someTextField.add(new IValidator<String>()
        {
            @Override
            public void validate(IValidatable<String> validatable)
            {
                System.out.println("value: " + validatable.getValue());
                System.out.println("model object: " + validatable.getModel()
                                                                 .getObject());
            }
        });
        Form<?> form = new Form<Void>("form");
        form.add(someTextField);
        add(form);
    }
}
