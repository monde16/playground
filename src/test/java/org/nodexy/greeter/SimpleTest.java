package org.nodexy.greeter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by phoenix on 28/11/16.
 */
public class SimpleTest {
    @Test
    public void testIfEval() {
        Object obj = null;
        Object str = new String("asdf");
        try {
            assertTrue(obj == null || obj.equals(str));
        } catch (NullPointerException e) {
            fail("or-ing doesn't pass if 1st clause is true");
        }
        try {
            assertFalse(obj != null && obj.equals(str));
        } catch (NullPointerException e) {
            fail("and-ing doesn't pass if 1st clause is false");
        }
    }
}
