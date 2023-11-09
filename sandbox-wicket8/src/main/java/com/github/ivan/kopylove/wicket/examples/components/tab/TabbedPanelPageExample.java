package com.github.ivan.kopylove.wicket.examples.components.tab;

import org.apache.wicket.extensions.ajax.markup.html.tabs.AjaxTabbedPanel;
import org.apache.wicket.extensions.markup.html.tabs.AbstractTab;
import org.apache.wicket.extensions.markup.html.tabs.ITab;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

import java.util.ArrayList;
import java.util.List;

class TabbedPanelPageExample extends WebPage
{
    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        List<ITab> tabs = new ArrayList<>();
        tabs.add(new AbstractTab(new Model<>("first tab"))
        {
            @Override
            public Panel getPanel(String panelId)
            {
                return new MyTabOne(panelId);
            }
        });

        tabs.add(new AbstractTab(new Model<>("second tab"))
        {
            @Override
            public Panel getPanel(String panelId)
            {
                return new MyTabTwo(panelId);
            }
        });

        add(new AjaxTabbedPanel<>("tabs", tabs));
    }
}
