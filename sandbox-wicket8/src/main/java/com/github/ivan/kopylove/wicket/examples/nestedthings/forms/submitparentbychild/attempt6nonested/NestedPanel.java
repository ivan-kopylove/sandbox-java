package com.github.ivan.kopylove.wicket.examples.nestedthings.forms.submitparentbychild.attempt6nonested;

import com.github.ivan.kopylove.wicket.util.Util;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxSubmitLink;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

class NestedPanel extends Panel
{
    private final Form<?>           injectedForm;
    private       TextField<String> nestedTextField;

    public NestedPanel(String id, Form<?> form)
    {
        super(id);
        this.injectedForm = form;
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        nestedTextField = buildNestedTextField();
        add(nestedTextField);
        if (injectedForm != null)
        {
            add(buildNestedSaveButtonAjaxSubmitLink(injectedForm));
        }
        else
        {
            add(buildNestedSaveButtonAjaxLink());
        }
    }

    private AjaxSubmitLink buildNestedSaveButtonAjaxSubmitLink(Form<?> injectedForm)
    {
        return new AjaxSubmitLink("nestedSaveButton", injectedForm)
        {
            @Override
            protected void onSubmit(AjaxRequestTarget target)
            {
                String msg = String.format("nestedTextField model object: %s, convertedInput: %s",
                                           nestedTextField.getModelObject(),
                                           nestedTextField.getConvertedInput());
                Util.showComponentMessage(this, msg);
                super.onSubmit(target);
            }

            @Override
            protected void onBeforeRender()
            {
                Util.showComponentMessage(this);
                super.onBeforeRender();
            }

            @Override
            protected void onModelChanging()
            {
                Util.showComponentMessage(this);
                super.onModelChanging();
            }

            @Override
            protected void onModelChanged()
            {
                Util.showComponentMessage(this);
                super.onModelChanged();
            }
        };
    }

    private AjaxLink<Void> buildNestedSaveButtonAjaxLink()
    {
        return new AjaxLink<Void>("nestedSaveButton")
        {
            @Override
            public void onClick(AjaxRequestTarget target)
            {
                String msg = String.format("nestedTextField model object: %s, convertedInput: %s",
                                           nestedTextField.getModelObject(),
                                           nestedTextField.getConvertedInput());
                Util.showComponentMessage(this, msg);
            }

            @Override
            protected void onBeforeRender()
            {
                Util.showComponentMessage(this);
                super.onBeforeRender();
            }

            @Override
            protected void onModelChanging()
            {
                Util.showComponentMessage(this);
                super.onModelChanging();
            }

            @Override
            protected void onModelChanged()
            {
                Util.showComponentMessage(this);
                super.onModelChanged();
            }
        };
    }

    private TextField<String> buildNestedTextField()
    {
        return new TextField<String>("nestedTextField", Model.of("nested value"))
        {
            @Override
            protected void onBeforeRender()
            {
                Util.showComponentMessage(this);
                super.onBeforeRender();
            }

            @Override
            protected void onModelChanging()
            {
                Util.showComponentMessage(this);
                super.onModelChanging();
            }

            @Override
            protected void onModelChanged()
            {
                Util.showComponentMessage(this);
                super.onModelChanged();
            }
        };
    }

    private Form<?> buildForm()
    {
        return new Form<Void>("nestedForm")
        {
            @Override
            protected boolean wantSubmitOnParentFormSubmit()
            {
                return true;
            }

            @Override
            protected boolean wantSubmitOnNestedFormSubmit()
            {
                return true;
            }

            @Override
            protected void onSubmit()
            {
                String msg = String.format("nestedTextField model object: %s, convertedInput: %s",
                                           nestedTextField.getModelObject(),
                                           nestedTextField.getConvertedInput());
                Util.showComponentMessage(this, msg);
                super.onSubmit();
            }
        };
    }
}
