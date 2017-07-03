package org.nodexy.greeter;

import junit.framework.TestCase;

import static org.nodexy.greeter.util.Utils.put;

/**
 * Created by phoenix on 15/11/16.
 */
public class StringBuilderTest extends TestCase {
    public void testNullParam() {
        StringBuilder sb = new StringBuilder(null);
        put("sb = "+sb);
    }

}
