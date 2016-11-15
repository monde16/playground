package org.nodexy.greeter;

import junit.framework.TestCase;

/**
 * Created by phoenix on 14/11/16.
 */
public class ThreadedGreeterTest extends TestCase {
    public void test() {
        new ThreadedGreeter().start();
    }
}
