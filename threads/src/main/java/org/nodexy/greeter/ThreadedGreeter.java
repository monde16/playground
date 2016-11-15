package org.nodexy.greeter;

import java.util.logging.Logger;

/**
 * Created by phoenix on 14/11/16.
 */
public class ThreadedGreeter extends Thread {
    private static Logger logger = Logger.getLogger(ThreadedGreeter.class.getCanonicalName());

    @Override
    public void run() {
        logger.info("ThreadedGreeter >> 'Hello, world!'");
    }
}
