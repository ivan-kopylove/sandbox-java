package com.github.ivan.kopylove.wicket.util;

import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.model.IModel;

import java.util.List;

class MyChoiceRenderer implements IChoiceRenderer<String>
{
    @Override
    public Object getDisplayValue(String object)
    {
        System.out.printf("object: %s%n", object);
        return object + " my custom postfix";
    }

    @Override
    public String getIdValue(String object, int index)
    {
        System.out.printf("index: %s, object: %s%n", index, object);
        return object + " my custom postfix";
    }

    @Override
    public String getObject(String id, IModel<? extends List<? extends String>> choices)
    {
        return null;
    }
}
