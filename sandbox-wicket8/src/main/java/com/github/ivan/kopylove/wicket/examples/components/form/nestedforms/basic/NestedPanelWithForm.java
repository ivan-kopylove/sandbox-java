package com.github.ivan.kopylove.wicket.examples.components.form.nestedforms.basic;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

class NestedPanelWithForm extends Panel
{
    public NestedPanelWithForm(String id)
    {
        super(id);
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        TextField textField = new TextField("myInput", Model.of("123"));

        Form<?> form = new Form<Void>("form")
        {
            @Override
            protected void onSubmit()
            {
                super.onSubmit();
                //nested form also will be triggered on form submit
            }
        };

        form.add(textField);
        add(form);
    }
}
