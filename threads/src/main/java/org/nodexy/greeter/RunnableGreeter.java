package org.nodexy.greeter;

import java.util.logging.Logger;

/**
 * Created by phoenix on 10/11/16.
 */
public class RunnableGreeter implements Runnable {
    private static Logger logger = Logger.getLogger(RunnableGreeter.class.getCanonicalName());
    @Override
    public void run() {
        logger.info("RunnableGreeter >> 'Hello from a thread!'");
    }
}
