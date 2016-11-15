package org.nodexy.greeter;

import junit.framework.TestCase;

import static org.nodexy.greeter.util.Utils.put;

/**
 * Created by phoenix on 09/11/16.
 */
public class StringTest extends TestCase {
    public void testFormat() {
        String str="1. %s 2. %s";
        put("Format string : "+str);
        put(String.format(str,"one","two%s","tree"));
        put(String.format(String.format(str,"one","two%s")," 3. tree"));
    }
}
