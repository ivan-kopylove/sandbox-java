package com.github.ivan.kopylove;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
import java.util.Map;

/**
 * Hello world!
 */
class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SomeService s = context.getBean(SomeService.class);
        String value = s.getValue("key123");
        String value2 = s.getValue("key456");
        System.out.println(value);
        System.out.println(value2);

        CacheManager manager = CacheManager.getInstance();
        manager.getCacheNames();
        net.sf.ehcache.Cache cache = manager.getCache("cacheName");

        Map<Object, Element> a = cache.getAll(cache.getKeys());

        Iterator<Element> i = a.values()
                               .iterator();
        while (i.hasNext())
        {
            System.out.println(i.next()
                                .getValue());
        }

        cache.getSize();

        System.out.println(cache.getSize());

        manager.shutdown();
        ((ConfigurableApplicationContext) context).close();
    }
}
