package com.codewars.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        a.add(";-~D");
        assertEquals(4, algorithms.countSmileys(a));
    }

    @Test
    public void Test() {
        assertTrue(algorithms.isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
        assertFalse(algorithms.isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e' }));
        assertFalse(algorithms.isValid(new char[] { 'w' }));
        assertFalse(algorithms.isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }
    @Test
    public void test200() {
        assertEquals(54321, algorithms.reverseInt(12345));
    }
    @Test
    public void fixedTest() {
        assertTrue(algorithms.feast("great blue heron", "garlic nann"));
        assertTrue(algorithms.feast("chickadee", "chocolate cake"));
        assertFalse(algorithms.feast("brown bear", "bear claw"));
    }
    
    @Test
    public void testBasic() {
        assertEquals(3,
                algorithms.arithmetic(1, 2, "add"));
        assertEquals(6, algorithms.arithmetic(8, 2, "subtract"));
        assertEquals(10,
                algorithms.arithmetic(5, 2, "multiply"));
        assertEquals(4, algorithms.arithmetic(8, 2, "divide"));
    }

    @Test
    public void Tests() {
        assertEquals("00:00:05", algorithms.makeReadable(5));
        assertEquals("00:01:00", algorithms.makeReadable(60));
        assertEquals("00:00:00", algorithms.makeReadable(0));
        assertEquals("23:59:59", algorithms.makeReadable(86399));
        assertEquals("99:59:59", algorithms.makeReadable(359999));
    }
    @Test
    public void thirtTests() {
        System.out.println("Fixed Tests: thirt");
        assertEquals(87, algorithms.thirt(1234567));
        assertEquals(79, algorithms.thirt(8529));
        assertEquals(31, algorithms.thirt(85299258));
        assertEquals(57, algorithms.thirt(5634));
        assertEquals(71, algorithms.thirt(1111111111));
        assertEquals(30, algorithms.thirt(987654321));
    }
}
