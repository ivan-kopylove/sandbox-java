package com.github.ivan.kopylove.wicket.examples.components.form;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;

class MyFormWithLink extends WebPage
{
    private static final long serialVersionUID = -4348869317433578819L;

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        Form<Void> form = new Form<Void>("form");

        AjaxLink<String> link = new AjaxLink<String>("trigger", Model.of("link text"))
        {
            @Override
            public void onClick(AjaxRequestTarget target)
            {
                int i = 0;
            }
        };

        Label label = new Label("label", Model.of("123"));
        link.add(label);

        //        AjaxButton trigger = new AjaxButton("trigger", Model.of("button text"))
        //        {
        //
        //            @Override
        //            protected void onSubmit(AjaxRequestTarget target, Form<?> form)
        //            {
        //                super.onSubmit(target, form);
        //            }
        //
        //
        //        };

        form.add(link);

        add(form);
    }
}
