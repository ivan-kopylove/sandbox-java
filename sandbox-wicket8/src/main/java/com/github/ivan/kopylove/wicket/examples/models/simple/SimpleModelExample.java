package com.github.ivan.kopylove.wicket.examples.models.simple;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class SimpleModelExample extends WebPage
{
    public SimpleModelExample()
    {
        add(new Label("message", "Hello World!"));
    }
}

