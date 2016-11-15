package org.nodexy.greeter.math;

import org.junit.Test;

/**
 * Created by phoenix on 11/1/16.
 */
public class VectorTest {
    @Test
    public void testCtor() {
        Vector<Integer> intVector = new Vector<>(4);
        put("intVector = ",intVector);
    }
    private static void put(Object ... args) {
        java.util.Arrays.asList(args).forEach(System.out::print);
        System.out.println();
    }
}
