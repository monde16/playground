package org.nodexy.greeter;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by phoenix on 10/11/16.
 */
public class RunnableGreeterTest extends TestCase {

    public static Logger logger = Logger.getLogger(RunnableGreeterTest.class.getCanonicalName());

    public void testRun() {
        (new Thread(new RunnableGreeter())).start();
    }
    public void testRun2() {
        new Thread(()-> logger.info("Runnable_lambda >> 'Hello from the other thread!!'")).start();
    }
}
