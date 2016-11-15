package org.nodexy.greeter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.nodexy.greeter.util.Utils.presentList;
import static org.nodexy.greeter.util.Utils.put;


/**
 * Created by phoenix on 10/27/16.
 */
public class MySpaceTest {
    @Test
    public void test1() throws Exception {
        Class c = java.util.ArrayList.class;
        put("c (toString) = ", c);
        put("c (canonicalName) = ", c.getCanonicalName());
        put("c (simpleName) = ",c.getSimpleName());

        Object x = c.newInstance();
        put("x = ", x);

        Class c1 = String.class;
        Class c2 = "".getClass();
        put("c1=",c1.getSimpleName());
        put("c2=",c2.getSimpleName());
        put("c1==c2? ",c1==c2);

        Object o = Class.forName("java.util.LinkedList").newInstance();
        put("forNamed--> ",o);
    }
    @Test
    public void test2() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(String.format("I am number %d",i+1));
        }
        put("list = "+list);
        put("sb = "+ presentList(list,", "));
    }

}
