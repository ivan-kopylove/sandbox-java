package com.github.ivan.kopylove.wicket.examples.prototypes.docdialog;

import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;

class MyModalWindow extends ModalWindow
{
    private static final long serialVersionUID = -4307944963703291701L;

    public MyModalWindow(String id)
    {
        super(id);
        setContent(new MyModalWindowContent(getContentId()));
    }
}
