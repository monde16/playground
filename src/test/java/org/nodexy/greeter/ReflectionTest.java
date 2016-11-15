package org.nodexy.greeter;

import org.junit.Test;

/**
 * Created by phoenix on 10/28/16.
 */
public class ReflectionTest {
    @Test
    public void testStackTrace() {
        method();
    }
    public void method() {
        Thread.dumpStack(); // this is all i needed!
    }
    private static void put(Object ... args) {
        java.util.Arrays.asList(args).forEach(System.out::print);
        System.out.println();
    }
}
