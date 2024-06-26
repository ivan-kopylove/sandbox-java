package com.github.ivan.kopylove.wicket.examples.components.modalwindow;

import com.github.ivan.kopylove.wicket.examples.components.MyModalWindow;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;

class PageWithModalWindow extends WebPage
{
    private static final long serialVersionUID = -4348869317433578819L;

    @Override
    protected void onInitialize()
    {
        super.onInitialize();
        MyModalWindow modalWindow = new MyModalWindow("someId");

        add(modalWindow);

        add(new AjaxLink<String>("trigger1")
        {

            @Override
            public void onClick(AjaxRequestTarget target)
            {
                modalWindow.show(target);
            }
        });

        Form<Void> form = new Form<>("form");

        AjaxButton trigger2 = new AjaxButton("trigger2")
        {

            @Override
            protected void onSubmit(AjaxRequestTarget target)
            {
                super.onSubmit(target);
            }
        };
        form.add(trigger2);

        add(form);
    }
}
