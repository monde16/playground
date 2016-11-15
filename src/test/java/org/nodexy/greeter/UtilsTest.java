package org.nodexy.greeter;

import junit.framework.TestCase;
import org.nodexy.greeter.util.Utils;

import java.util.Arrays;

/**
 * Created by phoenix on 09/11/16.
 */
public class UtilsTest extends TestCase {
    public void testPresentList() {
        String str = "SYSTEM, aziz.ally, adissues, aziz.ally, brandon.lucas, brian.fakude, busisiwe.khorombi, celiwe.motha.a, chumaf, didin, godfrey.khumalo, harriet.bekwaphi, jabulile.mabe, kwandem, letty.chiloane, lorraine.manamela, mbalenhle.dludla, mmathato.lentswe, pamelaz, patricia.stokes, phumzile.letsoalo, portia.banda, portia.madisha, rofhiwan";
        Utils.put(Utils.presentList(Arrays.asList(str.split(", ")), ", "));
    }
}
