package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.withprovider.basic;

import com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.basic.MyStruct;
import com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.basic.MyStructProvider;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.markup.html.repeater.tree.DefaultNestedTree;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

class DefaultNestedTreeExampleWithProvider extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        MyStructProvider myStructProvider = new MyStructProvider();

        DefaultNestedTree<MyStruct> defaultNestedTree = new DefaultNestedTree<MyStruct>("tree", myStructProvider)
        {

        };
        defaultNestedTree.setOutputMarkupId(true);
        add(defaultNestedTree);

        AjaxLink<String> ajaxLink = new AjaxLink<String>("updateTree", Model.of("button text"))
        {
            @Override
            public void onClick(AjaxRequestTarget target)
            {
                myStructProvider.detach();
                myStructProvider.reload();
                target.add(defaultNestedTree);
            }
        };
        add(ajaxLink);
    }
}
