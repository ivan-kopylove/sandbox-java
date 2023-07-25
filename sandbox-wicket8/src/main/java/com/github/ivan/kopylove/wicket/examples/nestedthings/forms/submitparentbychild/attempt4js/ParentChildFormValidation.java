package com.github.ivan.kopylove.wicket.examples.nestedthings.forms.submitparentbychild.attempt4js;

import com.github.ivan.kopylove.wicket.util.Util;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;

public class ParentChildFormValidation extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        ModalWindow parentWindow = new ModalWindow("parentWindow");
        parentWindow.setContent(new ParentPanel(parentWindow.getContentId()));
        parentWindow.setTitle("Parent window");
        add(parentWindow);

        add(new AjaxLink<Void>("showParentWindow")
        {
            @Override
            public void onClick(AjaxRequestTarget target)
            {
                Util.showComponentMessage(this);
                parentWindow.show(target);
            }
        });
    }
}
