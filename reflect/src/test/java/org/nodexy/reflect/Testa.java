package org.nodexy.reflect;

import junit.framework.TestCase;
import org.apache.commons.lang.time.DateUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
    public void testMethod() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object obj = String.class.newInstance();
        System.out.println("Trying reflection on object : "+obj.getClass().getCanonicalName() + " => '"+obj+"'");
        for (Method m : obj.getClass().getMethods()) {
            System.out.print("\tIs method <<"+m+">> easily invokable? ");
            if (m.getParameterCount() == 0) {
                System.out.println("Yes!");
                try {
                    if (m.getExceptionTypes().length > 0) {
                        System.out.println("\tWith possible exception(s)...");
                    } else {
                        System.out.println("\tInvoking...");
                        m.invoke(obj);
                    }
                } catch (Exception e) {
                    System.out.println("\t\t\tError : "+e);
                }
            }
            else System.out.println("No.");
        }
    }
    public void testLocalDateTime() {
        LocalDateTime nowLdt = LocalDateTime.now();
        LocalDateTime futLdt = nowLdt.plusMonths(12);
        Date nowDt = Date.from(nowLdt.toInstant(ZoneOffset.UTC));
        Date futDt = Date.from(futLdt.toInstant(ZoneOffset.UTC));
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
