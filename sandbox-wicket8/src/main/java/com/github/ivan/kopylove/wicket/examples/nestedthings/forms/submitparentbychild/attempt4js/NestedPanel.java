package com.github.ivan.kopylove.wicket.examples.nestedthings.forms.submitparentbychild.attempt4js;

import com.github.ivan.kopylove.wicket.util.Util;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

class NestedPanel extends Panel
{

    private final Form<?> parentForm;
    private TextField<String> textFieldNested;

    public NestedPanel(String id, Form<?> parentForm)
    {
        super(id);
        this.parentForm = parentForm;
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        Form<?> nestedForm = buildForm();
        add(nestedForm);

        textFieldNested = buildTextField();
        nestedForm.add(textFieldNested);

        AjaxButton nestedSaveButton = buildNestedSaveButton(nestedForm);
        nestedForm.add(nestedSaveButton);
    }

    private AjaxButton buildNestedSaveButton(Form<?> nestedForm)
    {
        return new AjaxButton("nestedSaveButton", nestedForm)
        {
            @Override
            protected void onSubmit(AjaxRequestTarget target)
            {
                String msg = String.format("textFieldNested model object: %s, convertedInput: %s",
                                           textFieldNested.getModelObject(),
                                           textFieldNested.getConvertedInput());
                Util.showComponentMessage(this, msg);

                String markupId = parentForm.getMarkupId();
                //                String s = "$('#" + markupId + "').on('submit', function(e) { console.log('submitted'); e.preventDefault(); });";
                String js = "$('#" + markupId + "').trigger('submit');";

                //                target.appendJavaScript(s);
                target.appendJavaScript(js);

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

    private TextField<String> buildTextField()
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
            protected void onSubmit()
            {
                Util.showComponentMessage(this);
                super.onSubmit();
            }
        };
    }
}
