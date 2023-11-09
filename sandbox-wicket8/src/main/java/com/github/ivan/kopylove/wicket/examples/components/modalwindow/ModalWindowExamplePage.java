package com.github.ivan.kopylove.wicket.examples.components.modalwindow;

import com.github.ivan.kopylove.wicket.examples.pages.MyEmptyPage;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;

class ModalWindowExamplePage extends WebPage
{

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        ModalWindow modalWindow = new ModalWindow("modalWindow");
        modalWindow.setPageCreator(MyEmptyPage::new);
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
