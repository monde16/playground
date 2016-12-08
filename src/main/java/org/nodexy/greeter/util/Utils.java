package org.nodexy.greeter.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by phoenix on 11/1/16.
 */
public class Utils {
    public static String presentList(List<String> list, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            sb.append(String.format("'%s'%s", list.get(i), (i+1==list.size()?"":sep+"")));
        }
        return sb.toString();
    }
    public static void put(Object ... args) {
        for (Object obj : args) System.out.print(obj);
        System.out.println();
    }
    public static String commaSepCollection(Collection collection) {
        if (collection==null || collection.isEmpty()) return "";
        Object obj = collection.iterator().next();
        boolean quoted = obj instanceof String;
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();

        if (it.hasNext()) sb.append((quoted?"'"+it.next()+"'":it.next()));

        if (quoted) {
            while (it.hasNext()) {
                sb.append(",'"+it.next()+"'");
            }
        } else {
            while (it.hasNext()) {
                sb.append(","+it.next());
            }
        }
        return sb.toString();
    }
}
