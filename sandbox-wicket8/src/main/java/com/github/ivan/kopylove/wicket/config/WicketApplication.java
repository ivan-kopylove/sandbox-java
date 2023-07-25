package com.github.ivan.kopylove.wicket.config;

import com.github.ivan.kopylove.wicket.examples.pages.Index;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication
{
    public Class<? extends Page> getHomePage()
    {
        return Index.class;
    }
}
