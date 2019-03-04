package com.codewars.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AlgorithmsTest {
    Algorithms algorithms = new Algorithms();

    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()");
        assertEquals(2, algorithms.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add("XD");
        a.add(":0}");
        a.add("x:-");
        a.add("):-");
        a.add("D:");
        assertEquals(1, algorithms.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add("X-}");
        a.add("xo)");
        a.add(":X");
        a.add(":-3");
        a.add(":3");
        assertEquals(2, algorithms.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":)");
        a.add("x-]");
        a.add(":ox");
        a.add(";-(");
        a.add(";-)");
        a.add(";~(");
        a.add(":~D");
        assertEquals(4, algorithms.countSmileys(a));
    }
}
