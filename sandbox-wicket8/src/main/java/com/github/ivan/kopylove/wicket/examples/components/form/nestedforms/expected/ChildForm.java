package com.github.ivan.kopylove.wicket.examples.components.form.nestedforms.expected;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

public class ChildForm extends Panel
{
    public ChildForm(final String id)
    {
        super(id);
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        TextField textField = new TextField("textField", Model.of("123"));

        Form<?> childForm = new Form<Void>("childForm")
        {
            @Override
            public boolean wantSubmitOnParentFormSubmit()
            {
                return false;
            }

            @Override
            public boolean wantSubmitOnNestedFormSubmit()
            {
                return false;
            }

            @Override
            protected void onSubmit()
            {
                super.onSubmit();
            }
        };

        childForm.add(textField);
        add(childForm);
    }
}
