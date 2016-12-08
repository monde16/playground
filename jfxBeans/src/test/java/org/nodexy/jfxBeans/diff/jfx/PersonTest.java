package org.nodexy.jfxBeans.diff.jfx;

import org.junit.Test;

/**
 * Created by phoenix on 07/12/16.
 */
public class PersonTest {
    @Test public void test() {
        Person p = new Person();
        System.out.println("p = "+p);
        p.setFirstName("John");
        p.setLastName("Wilde");
        p.setAlive(true);
        System.out.println("p = "+p);
    }
}
