package com.github.ivan.kopylove.wicket.examples.components.defaultnestedtree.withdata;

//import com.sun.org.apache.xerces.internal.dom.DeferredElementImpl;

import org.apache.wicket.extensions.markup.html.repeater.tree.DefaultNestedTree;
import org.apache.wicket.extensions.markup.html.repeater.util.TreeModelProvider;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * https://i.imgur.com/Wh82sDX.gif
 */
class MyPage extends WebPage
{
    public static TreeNode getDemoStruct2() throws IOException, ParserConfigurationException, SAXException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        File f = new File("C:\\1\\sandbox-wicket\\1.xml");
        f.exists();
        Document doc = builder.parse(f);

        doc.getDocumentElement();

        Node root = doc.getDocumentElement();

        DefaultMutableTreeNode treeRoot = new DefaultMutableTreeNode(root.getNodeName());

        TreeNode result = getStruct(treeRoot, root);

        System.out.println("12");
        return result;
    }

    private static DefaultMutableTreeNode getStruct(DefaultMutableTreeNode treeNode, Node node)
    {
        if (node.hasChildNodes())
        {
            NodeList list = node.getChildNodes();
            for (int i = 0; i < node.getChildNodes()
                                    .getLength(); i++)
            {
                Node subNode = list.item(i);
                //                if(subNode instanceof DeferredElementImpl)
                //                {
                //                    DefaultMutableTreeNode child = new DefaultMutableTreeNode(subNode.getNodeName());
                //                    treeNode.add(getStruct(child, subNode));
                //                }
            }
        }
        else
        {
            treeNode.add(new DefaultMutableTreeNode(node.getNodeName()));
        }

        return treeNode;
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        DefaultTreeModel model = null;
        try
        {
            model = new DefaultTreeModel(getDemoStruct2());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            e.printStackTrace();
        }

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

    private TreeNode getDemoStruct()
    {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("my_root_string");
        root.add(new DefaultMutableTreeNode("my_string"));
        return root;
    }
}
