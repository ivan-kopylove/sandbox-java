package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.complex;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.markup.html.repeater.tree.DefaultNestedTree;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

class DefaultNestedTreeExample extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        MyStructProvider myStructProvider = new MyStructProvider();

        DefaultNestedTree<MyNode> defaultNestedTree = new DefaultNestedTree<MyNode>("tree", myStructProvider);
        defaultNestedTree.setOutputMarkupId(true);
        add(defaultNestedTree);

        AjaxLink<String> ajaxLink = new AjaxLink<String>("updateTree", Model.of("button text"))
        {
            @Override
            public void onClick(AjaxRequestTarget target)
            {
                myStructProvider.reload();
                target.add(defaultNestedTree);
            }
        };
        add(ajaxLink);
    }
}
