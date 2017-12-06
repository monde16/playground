package test.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.nodexy.playground.junit.demos.MyUtils;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyTest {
    private int x;
    private int y;
    private int expected;

    public MyTest(int x, int y, int expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: mean(({0}+{1})/2)={2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 4, 6, 5 },
                { 2, 2, 2 },
                { 8, 2, 5 },
                { 1, 5, 3 }
        });
    }
    @Test
    public void testMean() {
        assertEquals((long) expected, (long) MyUtils.mean(x,y));
    }
}
