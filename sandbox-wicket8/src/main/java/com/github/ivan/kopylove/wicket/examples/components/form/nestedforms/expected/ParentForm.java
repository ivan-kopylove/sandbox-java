package com.github.ivan.kopylove.wicket.examples.components.form.nestedforms.expected;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;

class ParentForm extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        ChildForm childForm = new ChildForm("childForm");

        Form<?> form = new Form<Void>("parentForm")
        {
            @Override
            public boolean wantSubmitOnNestedFormSubmit()
            {
                return false;
            }

            @Override
            public boolean wantSubmitOnParentFormSubmit()
            {
                return false;
            }

            @Override
            protected void onSubmit()
            {
                super.onSubmit();
            }
        };


        form.add(childForm);
        add(form);
    }
}
