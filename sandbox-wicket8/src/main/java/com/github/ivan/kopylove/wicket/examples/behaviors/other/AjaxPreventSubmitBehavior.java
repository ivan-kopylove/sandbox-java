package com.github.ivan.kopylove.wicket.examples.behaviors.other;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxCallListener;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.markup.html.form.TextField;

class AjaxPreventSubmitBehavior extends AjaxEventBehavior
{
    public AjaxPreventSubmitBehavior()
    {
        super("keydown");
    }

    @Override
    protected void updateAjaxAttributes(AjaxRequestAttributes attributes)
    {
        super.updateAjaxAttributes(attributes);

        Component component = getComponent();
        if (!(component instanceof TextField<?>))
        {
            attributes.setChildSelector("input");
        }

        AjaxCallListener listener = new AjaxCallListener();
        listener.onPrecondition(
                "if (Wicket.Event.keyCode(attrs.event) !== 13) { console.log('anykey press has been prevented'); return false; } console.log('keycode 13 is passed precondition'); return true;");
        //        attributes.getDynamicExtraParameters().add("var eventKeycode = Wicket.Event.keyCode(attrs.event);" + "return {keycode: eventKeycode};");
        attributes.getAjaxCallListeners()
                  .add(listener);
        //        attributes.setAllowDefault(true);
    }

    @Override
    protected final void onEvent(AjaxRequestTarget target)
    {
        System.out.println("AjaxPreventSubmitBehavior - onevent");
    }
}
