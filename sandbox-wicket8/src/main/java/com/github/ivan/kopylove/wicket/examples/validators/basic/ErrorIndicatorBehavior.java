package com.github.ivan.kopylove.wicket.examples.validators.basic;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;

class ErrorIndicatorBehavior extends Behavior implements IValidator
{
    @Override
    public void validate(IValidatable validatable)
    {
        System.out.println("123");
    }

    @Override
    public void onComponentTag(Component c, ComponentTag tag)
    {
        FormComponent fc = (FormComponent) c;
        if (!fc.isValid())
        {
            tag.append("class", "error", " ");
        }
    }
}
