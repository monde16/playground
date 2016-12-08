package org.nodexy.reflect;

import junit.framework.TestCase;
import org.apache.commons.lang.time.DateUtils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * Created by phoenix on 18/11/16.
 */
public class Testa extends TestCase{
    public void test() {
        System.out.println(getMethodName()+" >>> 'Hello, world!'");
    }
    private static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    public void testLocalDateTime() {
        LocalDateTime nowLdt = LocalDateTime.now();
        LocalDateTime futLdt = nowLdt.plusMonths(12);
        Date nowDt = new Date().from(nowLdt.toInstant(ZoneOffset.UTC));
        Date futDt = new Date().from(futLdt.toInstant(ZoneOffset.UTC));
        System.out.println("nowLdt = "+nowLdt);
        System.out.println("futLdt = "+futLdt);
        System.out.println("nowDt = "+nowDt);
        System.out.println("futDt = "+futDt);


        System.out.println("*********************");
        Date date = new Date();
        System.out.println("now = "+date);
        System.out.println("future = "+DateUtils.addMonths(date,12));
    }
}
