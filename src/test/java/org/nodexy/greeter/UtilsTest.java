package org.nodexy.greeter;

import junit.framework.TestCase;
import org.nodexy.greeter.util.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by phoenix on 09/11/16.
 */
public class UtilsTest extends TestCase {
    public void testPresentList() {
        String str = "SYSTEM, aziz.ally, adissues, aziz.ally, brandon.lucas, brian.fakude, busisiwe.khorombi, celiwe.motha.a, chumaf, didin, godfrey.khumalo, harriet.bekwaphi, jabulile.mabe, kwandem, letty.chiloane, lorraine.manamela, mbalenhle.dludla, mmathato.lentswe, pamelaz, patricia.stokes, phumzile.letsoalo, portia.banda, portia.madisha, rofhiwan";
        Utils.put(Utils.presentList(Arrays.asList(str.split(", ")), ", "));
    }
    public void testCommaSepList() {
        List<Object> lstObj = Arrays.asList(new Object(), new Integer(123),new char[]{'i','c','o','n'},"To Mock A Killing Bird");
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7);
        List<String> lstStr = Arrays.asList("Tonight","we","are","young","...");
        Utils.put(Utils.commaSepCollection(null));
        Utils.put(Utils.commaSepCollection(new ArrayList()));
        Utils.put(Utils.commaSepCollection(lst));
        Utils.put(Utils.commaSepCollection(lstStr));
        Utils.put(Utils.commaSepCollection(lstObj));
        String str = "SYSTEM, aziz.ally, adissues, aziz.ally, brandon.lucas, brian.fakude, busisiwe.khorombi, celiwe.motha.a, chumaf, didin, godfrey.khumalo, harriet.bekwaphi, jabulile.mabe, kwandem, letty.chiloane, lorraine.manamela, mbalenhle.dludla, mmathato.lentswe, pamelaz, patricia.stokes, phumzile.letsoalo, portia.banda, portia.madisha, rofhiwan";
        Utils.put(Utils.commaSepCollection(Arrays.asList(str.split(", "))));
    }
}
