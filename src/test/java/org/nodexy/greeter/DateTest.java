package org.nodexy.greeter;

import junit.framework.TestCase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by phoenix on 5/23/17.
 */
public class DateTest extends TestCase{
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void testDateParser() throws ParseException {
        List<String> strings = getDateStrings();

        List<Date> dates = string2dates(strings);

        for (int i = 0; i < dates.size(); i++) {
            String x=strings.get(i),
                    y,
                    s=dates.get(i).toString(),
                    z=sdf.format(dates.get(i));
            y = s.substring(8,10)+"-"+s.substring(4,7)+"-"+s.substring(25,29);
            if (!x.equals(z)) {
                System.out.print(x + " --> " + y + "("+ z +")");
                if (isLeapYear(Integer.parseInt(strings.get(i).substring(6)))) {
                    System.out.println(" **");
                } else {
                    System.out.println();
                }
            }
        }

    }

    private List<String> getDateStrings() {
        List<String> strings = new LinkedList<>();
        for (int year = 1900; year < 2030; year++) {
            strings.add("31/12/"+year);
        }
        return strings;
    }

    private List<Date> string2dates(List<String> date_reps) {
        return date_reps.stream().map(this::string2date).collect(Collectors.toList());
    }

    private Date string2date(String rep) {
        try {
            return sdf.parse(rep);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean isLeapYear(int year) {
        assert(year>=0);
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
