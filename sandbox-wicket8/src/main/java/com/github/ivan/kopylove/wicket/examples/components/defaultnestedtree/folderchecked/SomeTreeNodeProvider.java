package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.folderchecked;

import org.apache.wicket.extensions.markup.html.repeater.tree.ITreeProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class SomeTreeNodeProvider implements ITreeProvider<CheckedFolderNode>
{
    private List<CheckedFolderNode> state = new ArrayList<>();

    @Override
    public Iterator<? extends CheckedFolderNode> getRoots()
    {
        return state.iterator();
    }

    @Override
    public IModel<CheckedFolderNode> model(CheckedFolderNode object)
    {
        return Model.of(object);
    }

    @Override
    public Iterator<? extends CheckedFolderNode> getChildren(CheckedFolderNode node)
    {
        return node.getChildren()
                   .iterator();
    }

    @Override
    public boolean hasChildren(CheckedFolderNode node)
    {
        return node.hasChildren();
    }

    @Override
    public void detach()
    {

    }

    public void reload()
    {
        CheckedFolderNode node = new CheckedFolderNode();
        node.setTitle("parent node");

        CheckedFolderNode node2 = new CheckedFolderNode();
        node.setParent(node);
        node2.setTitle("child node");
        node.getChildren()
            .add(node2);

        state = Collections.singletonList(node);
    }
}
