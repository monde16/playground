package org.nodexy.greeter.util;

import java.util.*;

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
    public List<Object[]> permute(Object[] objects) { // todo
        List<Object[]> perm = new LinkedList();
        if (objects.length == 0) return perm;
        Object[] array = new Object[objects.length];
        distribute(array, objects[0]);

        return perm;
    }

    private List<Object[]> distribute(Object[] objects, Object object) { // todo
        for (int i = 0; i < objects.length; ++i) {

        }
        return null;
    }

    private Object[] subsetExclude(Object[] set, int excludeIndex) {
        Object[] sub = new Object[set.length-1];
        for (int i = 0, counter = 0; i < set.length; ++i) {
            if (i != excludeIndex) {
                sub[counter] = set[i];
                ++counter;
            }
        }
        return sub;
    }
    private Object[] subset(Object[] set, int from) {
        return Arrays.copyOfRange(set, from, set.length);
    }
    private Object[] subset(Object[] set, int from, int to) {
        return Arrays.copyOfRange(set, from, to);
    }
}
