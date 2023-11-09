package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.basic;

import org.apache.wicket.extensions.markup.html.repeater.tree.DefaultNestedTree;
import org.apache.wicket.extensions.markup.html.repeater.util.TreeModelProvider;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 */
class MyPage extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode());

        TreeModelProvider<DefaultMutableTreeNode> modelProvider = new TreeModelProvider<DefaultMutableTreeNode>(model)
        {
            @Override
            public IModel<DefaultMutableTreeNode> model(DefaultMutableTreeNode object)
            {
                return Model.of(object);
            }
        };

        DefaultNestedTree tree = new DefaultNestedTree("tree", modelProvider);
        add(tree);
    }
}
