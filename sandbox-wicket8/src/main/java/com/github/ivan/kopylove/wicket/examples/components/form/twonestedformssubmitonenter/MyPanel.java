package com.github.ivan.kopylove.wicket.examples.components.form.twonestedformssubmitonenter;

import com.github.ivan.kopylove.wicket.examples.components.textfield.MyModelObject;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxSubmitLink;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

class MyPanel extends Panel
{
    private final MyModelObject myModelObject = new MyModelObject();

    public MyPanel(String id)
    {
        super(id);
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        Form<?> form = new Form<Void>("nestedForm")
        {
            @Override
            protected void onSubmit()
            {
                super.onSubmit();
            }
        };

        form.setOutputMarkupId(true);
        add(form);

        TextField<String> textField = new TextField<>("textField", new PropertyModel<>(myModelObject, "prop"));
        textField.setOutputMarkupId(true);
        form.add(textField);

        AjaxSubmitLink searchButton2 = new AjaxSubmitLink("searchButton", form)
        {
            private static final long serialVersionUID = 8779923761589435319L;

            @Override
            protected void onSubmit(AjaxRequestTarget target)
            {
                System.out.println("123");
            }
        };
        form.add(searchButton2);
        form.setDefaultButton(searchButton2);
    }
}
