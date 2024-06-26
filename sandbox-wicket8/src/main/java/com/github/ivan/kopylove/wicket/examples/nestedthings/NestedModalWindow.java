package com.github.ivan.kopylove.wicket.examples.nestedthings;

import com.github.ivan.kopylove.wicket.examples.nestedthings.dialogs.MyModalWindow1;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;

class NestedModalWindow extends WebPage
{

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        ModalWindow modalWindow = new ModalWindow("modalWindow");
        modalWindow.setContent(new MyModalWindow1(modalWindow.getContentId())
        {
            @Override
            public void onCloseNested2(AjaxRequestTarget target)
            {
                modalWindow.close(target);
            }
        });
        add(modalWindow);

        add(new AjaxLink<Void>("showModalWindow")
        {

            @Override
            public void onClick(AjaxRequestTarget target)
            {
                modalWindow.show(target);
            }
        });
    }
}
